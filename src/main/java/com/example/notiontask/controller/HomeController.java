package com.example.notiontask.controller;

import com.example.notiontask.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping()
    public String homePage(Model model) {
        model.addAttribute(new User());
        return "home";
    }
}
