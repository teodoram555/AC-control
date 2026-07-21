package com.example.demo.domain.repo;

import com.example.demo.domain.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepo extends MongoRepository<User,String>
{
    User findByEmail(String email);
}
