package com.example.demo.controller;

import com.example.demo.config.ConfigName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TestController {


    @Autowired
    private ConfigName configName;
    @RequestMapping("/get/sss")
    public  String getName(){
        String name = configName.getName();
        return  name;


    }
}
