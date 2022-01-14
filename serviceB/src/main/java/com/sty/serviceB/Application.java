package com.sty.serviceB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

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

}
