package com.example.acControl.domain.repo;

import com.example.acControl.domain.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepo extends MongoRepository<User,String>
{
    User findByEmail(String email);
}
