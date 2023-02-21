package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

	public class NAME {
    private String studentName="MyName";
    @GetMapping("/")
    public String getName()
    {
        return "Welcome "+studentName;
    }
    
}