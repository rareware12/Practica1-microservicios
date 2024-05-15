package com.wannacode.mcsvbooking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class McsvBookingApplication {

    public static void main(String[] args) {
        SpringApplication.run(McsvBookingApplication.class, args);
    }

}
