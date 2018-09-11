package com.xian.springcloud.controller;

import java.util.List;

import com.xian.springcloud.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import com.xian.springcloud.service.DeptService;


@RestController
public class DeptController {
    @Autowired
    private DeptService service;

    @Autowired
    private DiscoveryClient client;

    @PostMapping("/dept")
    public boolean add(@RequestBody Dept dept) {

        return service.add(dept);
    }

    @GetMapping("/dept/{id}")
    public Dept get(@PathVariable("id") Long id) {

        return service.get(id);
    }

    @GetMapping("/dept")
    public List<Dept> list() {

        return service.list();
    }

    @GetMapping("/dept/discovery")
    public Object discovery() {
        List<String> list = client.getServices();
        System.out.println("**********" + list);

        List<ServiceInstance> srvList = client.getInstances("MICROSERVICECLOUD-DEPT");
        for (ServiceInstance element : srvList) {
            System.out.println(element.getServiceId() + "\t" + element.getHost() + "\t" + element.getPort() + "\t"
                    + element.getUri());
        }
        return this.client;
    }

}
