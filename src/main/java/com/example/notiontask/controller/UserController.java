package com.example.notiontask.controller;

import com.example.notiontask.Entyty.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("/users")
@SessionAttributes
public class UserController {
    @GetMapping
    public String userPage(Model model){
        model.addAttribute("user",new User());
        return "user";
    }
    @PostMapping()
    public String newUser(@Valid User user, Model model){
        model.addAttribute("user1", user);
        return "user";
    }

}
