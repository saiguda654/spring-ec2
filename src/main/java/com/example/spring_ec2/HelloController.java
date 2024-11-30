package com.example.spring_ec2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // This method handles the root URL ("/")
    @GetMapping("/")
    public String sayHello() {
        return "Hello, World from sai guda!";
    }

    // This method handles the "/hello" URL
    @GetMapping("/hello")
    public String saySpringBootHello() {
        return "Hello, Spring Boot!";
    }
}
