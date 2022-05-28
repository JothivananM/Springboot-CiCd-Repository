package com.springboot.cicd.springbootcicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {
    
    @GetMapping
    public String demo(){
        return "Demo for the Auto Deploy Spring Boot Project Using GitHub Actions to AWS EC2";
    }
}
