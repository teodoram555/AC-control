package com.example.acControl.domain.repo;

import com.example.acControl.domain.model.HistoryLog;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface HistoryLogRepo extends MongoRepository<HistoryLog,String>
{
    List<HistoryLog> findByDatastreamId(String datastreamId);

}
