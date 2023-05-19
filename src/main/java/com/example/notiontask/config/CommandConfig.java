package com.example.notiontask.config;

import com.example.notiontask.DefaultUserProperties;
import com.example.notiontask.entity.User;
import com.example.notiontask.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CommandConfig {

    @Bean
    public CommandLineRunner dataLoader(DefaultUserProperties defUs, UserRepository userRepo) {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                User user = new User(defUs.getFirstname(), defUs.getSecondname(), defUs.getLastname());
                userRepo.save(user);
            }
        };
    }
}
