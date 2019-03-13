package com.lgl.study.discover.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaServer
@ComponentScan(value = "com.lgl.study.discover.eureka")
public class DiscoverEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiscoverEurekaApplication.class, args);
    }

}

