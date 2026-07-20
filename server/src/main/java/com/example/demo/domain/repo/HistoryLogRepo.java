package com.example.demo.domain.repo;

import com.example.demo.domain.model.HistoryLog;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface HistoryLogRepo extends MongoRepository<HistoryLog,String> {
    List<HistoryLog> findByDatastreamId(String datastreamId);
}
