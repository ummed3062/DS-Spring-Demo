package com.mru.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cal")
public class Cal {
    
    @GetMapping("/add/{a}/{b}") //  /add/10/50
    int add(@PathVariable int a, @PathVariable int b) {
        
        return a+b;
    }

    @GetMapping("/mul")
    int mul(@RequestParam int a, @RequestParam int b, @RequestParam int d) { //  /mul?a=10&b=50&c=20
        
        return a*b*d;

    }



    
}
