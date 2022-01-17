package com.sty.serviceB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Application.
 *
 * @author shitianyu 2022-01-11 21:55
 */
@SpringBootApplication
@EnableFeignClients(basePackages = "com.sty")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @LoadBalanced
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
