package com.example.notiontask.controller;

import com.example.notiontask.entyty.User;
import com.example.notiontask.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/users")
public class UserController {
    private final UserRepository userRepo;

    @Autowired
    public UserController(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    @GetMapping("/{id}")
    public String userPage(@PathVariable Long id, Model model) {
        model.addAttribute("user", userRepo.findById(id).get());
        return "user";
    }

    @PostMapping()
    public String newUser(@Valid User user) {
        userRepo.save(user);
        return "home";
    }

}
