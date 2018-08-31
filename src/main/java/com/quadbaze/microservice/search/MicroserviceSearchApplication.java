package com.quadbaze.microservice.search;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@EnableFeignClients
@EnableCircuitBreaker
@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan(basePackages = {
        "com.quadbaze.microservice.search",
        "com.quadbaze.microservice.domain",
        "com.quadbaze.microservice.common"
})
public class MicroserviceSearchApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceSearchApplication.class, args);
    }
}
