package com.beita.serverconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;


//@EnableConfigServer注解开启配置服务器
@EnableConfigServer
@SpringBootApplication
public class ServerConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerConfigApplication.class, args);
    }

}
