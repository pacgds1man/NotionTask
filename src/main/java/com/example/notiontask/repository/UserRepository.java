package com.example.notiontask.repository;

import com.example.notiontask.entyty.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
