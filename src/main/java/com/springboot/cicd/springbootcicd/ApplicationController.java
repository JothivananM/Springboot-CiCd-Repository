package com.springboot.cicd.springbootcicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {
    
    @GetMapping
    public String demo(){
        return "Hi";
    }
}
