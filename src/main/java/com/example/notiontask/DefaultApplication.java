package com.example.notiontask;

import com.example.notiontask.config.CommandConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class DefaultApplication {
    public static void main(String[] args) {
        SpringApplication.run(CommandConfig.class, args);
    }

}
