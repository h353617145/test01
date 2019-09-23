package com.ziyun.consumerdemo;

import org.springframework.stereotype.Component;

@Component
public class EchoServiceFallback implements EchoService{

    @Override
    public String get() {

        return "EchoServiceFallback";
    }
}
