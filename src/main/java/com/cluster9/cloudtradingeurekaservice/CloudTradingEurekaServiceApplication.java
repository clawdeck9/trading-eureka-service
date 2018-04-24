package com.cluster9.cloudtradingeurekaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class CloudTradingEurekaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudTradingEurekaServiceApplication.class, args);
	}
}
