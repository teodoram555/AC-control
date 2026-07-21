package com.example.acControl.domain.repo;

import com.example.acControl.domain.model.Datastream;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface DatastreamRepo extends MongoRepository<Datastream,String>
{
    List<Datastream> findByDeviceId(String deviceId);
}
