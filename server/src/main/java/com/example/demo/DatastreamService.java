package com.example.demo;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class DatastreamService {
    private final DatastreamRepo datastreamRepo;
    public Datastream createDatastream(Datastream datastream){
        return datastreamRepo.save(datastream);
    }
}
