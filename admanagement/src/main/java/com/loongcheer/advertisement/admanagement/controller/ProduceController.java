package com.loongcheer.advertisement.admanagement.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProduceController {
    @RequestMapping(value = "getProduct")
    public String getproduct(){
        return "123";
    }
}
