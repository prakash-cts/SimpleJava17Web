package com.example.simplejava17web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 868065
 */
@RestController
public class LoginController {
    @GetMapping
    public String loginMessage(){
        return "Simple Java 17 Web app login is successful";
    }
}
