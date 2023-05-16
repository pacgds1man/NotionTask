package com.example.notiontask.data;

import com.example.notiontask.Entyty.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
