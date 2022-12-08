package com.example.LibraryApp_Backend.Controller;

import com.example.LibraryApp_Backend.Controller.model.Library;
import com.example.LibraryApp_Backend.dao.LibraryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class LibraryController {
    @Autowired
    private LibraryDao dao;
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
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/entry",consumes = "application/json",produces = "application/json")
    public Map<String,String> BookEntry(@RequestBody Library l)
    {
        System.out.println(l.getTitle().toString());
        System.out.println(l.getAuthor().toString());
        System.out.println(l.getDescription().toString());
        System.out.println(l.getDistributor().toString());
        System.out.println(l.getLanguage().toString());
        System.out.println(l.getPrice());
        System.out.println(l.getPublisher().toString());
        System.out.println(l.getImage().toString());
        System.out.println(l.getReleaseyear());
        dao.save(l);
        HashMap<String,String> map=new HashMap<>();
        map.put("status","success");
        return map;
    }
    @PostMapping("/search")
    public String BookSearch()
    {
        return "Welcome to book search page";
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<Library> BookView()
    {
        return (List<Library>) dao.findAll();
    }
    @PostMapping("/delete")
    public String BookDelete()
    {
        return "Welcome to book delete page";
    }
    @PostMapping("/issue")
    public String BookIssue()
    {
        return "Welcome to book issue page";
    }
    @PostMapping("/edit")
    public String BookEdit()
    {
        return "Welcome to book edit page";
    }
}
