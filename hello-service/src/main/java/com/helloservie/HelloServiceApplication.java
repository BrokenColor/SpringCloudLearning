package com.helloservie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Description:服务提供者
 * <p>
 * Author: GWL
 * Date: Create in 19:45 2019/8/20
 */
@SpringBootApplication
@EnableDiscoveryClient
public class HelloServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(HelloServiceApplication.class, args);
    }
}
