package com.ziyunshop.shopserverdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ShopServerDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopServerDemoApplication.class, args);

    }

}
