package com.ziyun.consumerdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    @Autowired
    private EchoService echoService;

    @RequestMapping("test")
    public String test(){
        return echoService.get();
    }
}
