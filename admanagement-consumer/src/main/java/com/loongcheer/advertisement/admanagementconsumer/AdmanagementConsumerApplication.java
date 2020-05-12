package com.loongcheer.advertisement.admanagementconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.stereotype.Component;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class AdmanagementConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdmanagementConsumerApplication.class, args);
    }

}
