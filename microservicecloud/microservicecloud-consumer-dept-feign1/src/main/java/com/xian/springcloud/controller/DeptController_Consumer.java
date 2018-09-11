package com.xian.springcloud.controller;

import com.xian.springcloud.entities.Dept;
import com.xian.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptController_Consumer {

    @Autowired
    private DeptClientService service;

    @GetMapping("/consumer/dept/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return this.service.get(id);
    }

    @GetMapping("/consumer/dept")
    public List<Dept> list() {
        return this.service.list();
    }

    @PostMapping("/consumer/dept")
    public boolean add(Dept dept) {
        return this.service.add(dept);
    }

}
