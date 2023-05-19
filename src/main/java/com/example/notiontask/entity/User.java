package com.example.notiontask.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Data
@Entity
public class User {
    @Id
    @GeneratedValue
    private Long id;
    private String firstname;
    private String secondname;
    private String lastname;

    public User(String firstname, String secondname, String lastname) {
        this.firstname = firstname;
        this.secondname = secondname;
        this.lastname = lastname;
    }

    public User() {
    }
}
