package com.mru.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mru.Entity.Student;

import jakarta.annotation.PostConstruct;

@RestController
@RequestMapping("/student")
public class StudentAPI {
    

    @PostMapping("/details")
    ResponseEntity<Student> details(@RequestBody Student stuObj){

        stuObj.setId(100);;
        stuObj.setName("Ummad");
        stuObj.setAge("20");


        return ResponseEntity.ok(stuObj);
    }
}
