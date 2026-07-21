package com.example.acControl.domain.repo;

import com.example.acControl.domain.model.Device;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface DeviceRepo extends MongoRepository<Device,String>
{
    List<Device>findByUserId(String userId);
}
