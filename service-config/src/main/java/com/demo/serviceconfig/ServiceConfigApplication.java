package com.demo.serviceconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ServiceConfigApplication {

	public static void main(String[] args) {
		System.setProperty("ENCRYPT_KEY", ";lasjdvpio21213vsdv23@@dasds@VCFE");
		System.setProperty("encrypt.key", ";lasjdvpio21213vsdv23@@dasds@VCFE");
		SpringApplication.run(ServiceConfigApplication.class, args);
	}

}
