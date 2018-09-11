package com.xian.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy

public class MicroservicecloudZuulGateway9528Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicecloudZuulGateway9528Application.class, args);
	}
}
