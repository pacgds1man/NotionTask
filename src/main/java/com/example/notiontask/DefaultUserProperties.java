package com.example.notiontask;

import com.example.notiontask.repository.UserRepository;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Component
@ConfigurationProperties(prefix = "notion.user")
public class DefaultUserProperties {

    private String firstname;
    private String secondname;
    private String lastname;


}
