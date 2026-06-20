package com.mru.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloApi {

    //http://localhost:8080/api/hello
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }

    //http://localhost:8080/api/add
    @GetMapping("/add")
    int add() {
        return 10+20;
    }

    //http://localhost:8080/api/sub
    @PostMapping("/sub")
    int sub() {
        return 20 - 10;
    }
}
