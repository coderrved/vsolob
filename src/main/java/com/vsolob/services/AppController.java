package com.vsolob.services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class AppController {

    @GetMapping
    public String sayHello() {

        return "Hello World!";
    }
}
