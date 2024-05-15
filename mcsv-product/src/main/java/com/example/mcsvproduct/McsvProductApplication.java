package com.example.mcsvproduct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class McsvProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(McsvProductApplication.class, args);
    }

}
