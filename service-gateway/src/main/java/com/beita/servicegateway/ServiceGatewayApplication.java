package com.beita.servicegateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.Route;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@EnableDiscoveryClient
@SpringBootApplication
public class ServiceGatewayApplication {

    private static ConfigurableApplicationContext context;

    public static void main(String[] args) {
        SpringApplication.run(ServiceGatewayApplication.class, args);
    }

    @Bean
    public RouteLocatorBuilder routeLocatorBuilder() {
        return new RouteLocatorBuilder(context);
    }

    @Bean
    public RouteLocator route(RouteLocatorBuilder builder){
        return builder.routes()
                .route(p -> p
                    .path("/get")
                    .filters(f -> f.addResponseHeader("Hello","World"))
                    .uri("http://httpbin.org:80"))      //将工程的请求转发到“http://httpbin.org/get”

                .route(p -> p
                    .host("*.hystrix.com")
                    .filters(f -> f
                        .hystrix(config -> config
                            .setName("mycmd")
                            .setFallbackUri("forward:/fallback")))
                    .uri("http://httpbin.org:80"))      //将工程的请求转发到“http://httpbin.org/get”

                .build();


    }
}
