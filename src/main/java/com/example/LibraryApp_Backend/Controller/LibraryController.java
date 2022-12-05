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
    @PostMapping("/login")
    public String UserLogin()
    {
        return "Welcome to user login page";
    }
    @PostMapping("/register")
    public String UserRegister()
    {
        return "Welcome to user register page";
    }
    @PostMapping("/entry")
    public String BookEntry()
    {
        return "Welcome to book entry page";
    }
}
