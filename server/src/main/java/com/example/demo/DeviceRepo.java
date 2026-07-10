package com.example.demo;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface DeviceRepo extends MongoRepository<Device,String> {
    List<Device>findByUserId(String userId);
}
