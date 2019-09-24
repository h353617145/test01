package com.ziyunshop.shopserverdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.ziyunshop.shopserverdemo.mapper")
public class ShopServerDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopServerDemoApplication.class, args);

    }

}
