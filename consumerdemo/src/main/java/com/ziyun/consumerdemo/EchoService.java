package com.ziyun.consumerdemo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value="shop",fallback = EchoServiceFallback.class)
public interface EchoService {

    @GetMapping(value = "/get")
    String get();
}
