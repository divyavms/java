package com.spring.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetController {

    @GetMapping(value="/api/v1/hello-world",produces= MediaType.TEXT_PLAIN_VALUE)
    public String helloWorld(){
        return "hello World";
    }
}
