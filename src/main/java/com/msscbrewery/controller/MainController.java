package com.msscbrewery.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @ResponseBody
    @GetMapping("/")
    public String welcome(){
        return "Hello! World";
    }
}
