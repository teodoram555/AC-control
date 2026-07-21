package com.example.acControl.application;

import com.example.acControl.domain.model.Datastream;
import com.example.acControl.domain.repo.DatastreamRepo;
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
