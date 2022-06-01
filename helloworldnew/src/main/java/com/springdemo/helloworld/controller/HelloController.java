package com.springdemo.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("Admin")
    @ResponseBody
    public String GeneralKenobi()
    {
        return "Hello there";
    }

    @GetMapping("")
    @ResponseBody
    public String General()
    {
        return "Hello there";
    }

}
