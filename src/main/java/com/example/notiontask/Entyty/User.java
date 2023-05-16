package com.example.notiontask.Entyty;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Data
@Entity
public class User {
    @Id
    @GeneratedValue
    private Long id;
    private String firstname;
    private String secondname;
    private String lustname;

}
