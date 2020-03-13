package org.example.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DiscoveryServiceApplicaton {

    public static void main(String[] args) {
        SpringApplication.run(DiscoveryServiceApplicaton.class, args);
    }
}