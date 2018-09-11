package com.xian.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@EnableConfigServer
public class MicroservicecloudConfig3344Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicecloudConfig3344Application.class, args);
	}
}
