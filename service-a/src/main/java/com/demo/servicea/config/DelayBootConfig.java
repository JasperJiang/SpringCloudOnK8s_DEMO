package com.demo.servicea.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.concurrent.TimeUnit;

@Component
@Slf4j
public class DelayBootConfig {

    @PostConstruct
    private void init() throws InterruptedException {
        log.info("waiting 5 sec");
        TimeUnit.SECONDS.sleep(5);
    }
}
