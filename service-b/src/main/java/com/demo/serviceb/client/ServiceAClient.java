package com.demo.serviceb.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(url = "http://service-a", name = "service-a")
public interface ServiceAClient {

    @GetMapping("/hello")
    public String hello();

    @GetMapping("info")
    public String getInfo();
}
