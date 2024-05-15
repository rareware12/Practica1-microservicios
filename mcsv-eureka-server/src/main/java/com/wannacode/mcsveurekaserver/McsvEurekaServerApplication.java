package com.wannacode.mcsveurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class McsvEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(McsvEurekaServerApplication.class, args);
	}

}
