package com.xian.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer     //EurekaServer服务端启动类，接收其他微服务注册进来
public class MicroservicecloudEureka7004Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicecloudEureka7004Application.class, args);
	}
}
