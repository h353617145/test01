package com.ziyunshop.shopserverdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigController {

    @Autowired
    private ConfigurableApplicationContext context;

    @RequestMapping("/get")
    public String get() {
        return "hello, im server"+context.getEnvironment().getProperty("my.name");
    }
}
