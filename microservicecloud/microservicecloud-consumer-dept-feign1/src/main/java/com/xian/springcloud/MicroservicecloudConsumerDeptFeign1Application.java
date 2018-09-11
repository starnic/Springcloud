package com.xian.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.xian.springcloud"})
@ComponentScan("com.xian.springcloud")
public class MicroservicecloudConsumerDeptFeign1Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicecloudConsumerDeptFeign1Application.class, args);
	}
}
