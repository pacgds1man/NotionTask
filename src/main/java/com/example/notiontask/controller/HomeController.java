package com.example.notiontask.controller;

import com.example.notiontask.Entyty.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping()
    public String homePage() {
        return "home";
    }
    @ModelAttribute(name = "user1")
    public User user(){
        return new User();
    }
}
