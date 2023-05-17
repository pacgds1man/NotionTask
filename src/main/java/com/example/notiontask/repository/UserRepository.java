package com.example.notiontask.repository;

import com.example.notiontask.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
