package com.demo.servicea.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
@Slf4j
public class ServiceInfoController {

    @GetMapping("info")
    public String getInfo() throws UnknownHostException {
        return InetAddress.getLocalHost().getHostAddress();
    }
}
