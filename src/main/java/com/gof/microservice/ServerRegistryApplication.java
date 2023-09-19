package com.gof.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServerRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerRegistryApplication.class, args);
		System.out.println("Eureka server Executed");
	}

}
