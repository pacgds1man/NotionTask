package com.example.notiontask.Entyty;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Data
public class User {
    private String firstName;
    private String secondName;
    private String lustName;

}
