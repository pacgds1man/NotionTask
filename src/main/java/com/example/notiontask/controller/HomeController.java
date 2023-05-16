package com.example.notiontask.controller;

import com.example.notiontask.entyty.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping()
    public String homePage() {
        return "home";
    }

    @ModelAttribute(name = "user")
    public User user() {
        return new User();
    }
}
