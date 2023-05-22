package com.example.notiontask.controller;

import com.example.notiontask.entity.User;
import com.example.notiontask.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import javax.jws.soap.SOAPBinding;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserRepository userRepo;

    @Autowired
    public UserController(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    @GetMapping("/{id}")
    public User findUser(@PathVariable Long id) {
        return userRepo.findById(id).get();
    }

    @GetMapping()
    public List<User> findAllUser() {
        return userRepo.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User newUser(@RequestBody User user) {
        return userRepo.save(user);
    }

    @PutMapping("/{id}")
    public User chengeUser(@PathVariable Long id, @RequestBody User cheng){
        if (cheng.getId() == null) {
            cheng.setId(id);
        }
        return userRepo.save(cheng);
    }

    @PatchMapping("/{id}")
    public User patchUser(@PathVariable Long id, @RequestBody User patch) {
        User user = userRepo.findById(id).get();

        if (patch.getFirstname() != null) {
            user.setFirstname(patch.getFirstname());
        }
        if (patch.getSecondname() != null) {
            user.setSecondname(patch.getSecondname());
        }
        if (patch.getLastname() != null) {
            user.setLastname(patch.getLastname());
        }

        return userRepo.save(user);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteUser(@PathVariable Long id){
        userRepo.deleteById(id);
    }

}
