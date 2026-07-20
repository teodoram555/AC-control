package com.example.demo.application;

import com.example.demo.domain.model.Datastream;
import com.example.demo.domain.repo.DatastreamRepo;
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
