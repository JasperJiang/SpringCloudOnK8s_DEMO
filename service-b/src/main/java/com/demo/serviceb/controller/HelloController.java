package com.demo.serviceb.controller;

import com.demo.serviceb.client.ServiceAClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloController {

    @Autowired
    ServiceAClient serviceAClient;

    @GetMapping("hello")
    public String hello(){
        log.info("service b say hello");
        return serviceAClient.hello() + " |||| service b say hello";
    }
}
