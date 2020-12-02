package com.example.forum.contollers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SomeController {
    @GetMapping("/hello")
    public String SayHello() {
        return "Hello World";
    }
}
