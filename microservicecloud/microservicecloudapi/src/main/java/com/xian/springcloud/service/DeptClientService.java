package com.xian.springcloud.service;

import com.xian.springcloud.entities.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * @Description: 修改microservicecloud-api工程
 * 根据已有的deptclientservice接口新建一个实现了
 * FallbackFactory接口的类DeptClientServiceFallbackFactory
 *
 */

//@FeignClient(value = "MICROSERVICECLOUD-DEPT")
@FeignClient(value = "MICROSERVICECLOUD-DEPT", fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface DeptClientService {

    @GetMapping("/dept/{id}")
    public Dept get(@PathVariable("id") Long id);

    @GetMapping("/dept")
    public List<Dept> list();

    @PostMapping("/dept")
    public boolean add(Dept dept);
}
