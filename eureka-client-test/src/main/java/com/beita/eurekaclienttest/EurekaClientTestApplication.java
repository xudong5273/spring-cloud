package com.beita.eurekaclienttest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaClientTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientTestApplication.class, args);
    }

}
