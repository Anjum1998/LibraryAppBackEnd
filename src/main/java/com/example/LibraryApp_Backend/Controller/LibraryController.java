package com.example.LibraryApp_Backend.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController {

    @PostMapping("/")
    public String AdminLogin()
    {
        return "Welcome to admin login page";
    }
}
