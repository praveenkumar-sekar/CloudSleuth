package com.demoServer.spring_CloudSleuthServer.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/hello")

public class ServiceController {
    private  static final Logger LOGGER = LoggerFactory.getLogger(ServiceController.class);

    @GetMapping(value ="/server")
    public String hello(){
        LOGGER.info("Reached Server");
        return"Helloworld";
    }
}
