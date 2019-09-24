package com.ziyunshop.shopserverdemo.controller;

import com.ziyunshop.shopserverdemo.mapper.UserMapper;
import com.ziyunshop.shopserverdemo.pojo.T_user;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RefreshScope
@Log
public class ConfigController {

    @Autowired
    private ConfigurableApplicationContext context;

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/get")
    public String get() {
        T_user t_user = new T_user();
        t_user.setName("test"+ UUID.randomUUID().toString().substring(0,5));
        userMapper.insert(t_user);

        List<T_user> list = userMapper.selectAll();
        log.info(list.toString());

        return "hello, im server"+context.getEnvironment().getProperty("my.name");
    }

    @RequestMapping("users")
    public String users(){
        return userMapper.selectAll().toString();
    }


}
