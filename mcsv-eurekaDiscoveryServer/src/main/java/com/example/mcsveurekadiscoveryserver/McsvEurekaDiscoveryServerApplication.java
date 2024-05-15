package com.example.mcsveurekadiscoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class McsvEurekaDiscoveryServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(McsvEurekaDiscoveryServerApplication.class, args);
    }

}
