package com.example.demo;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@RestController
@RequestMapping("/api/iot")
@AllArgsConstructor
public class IoTController {

    private HistoryLogRepo historyLogRepo;
    private DatastreamRepo datastreamRepo;

    @GetMapping("/log")
    public ResponseEntity<String> receiveSensorData(String datastreamId, double value){
        HistoryLog newLog = new HistoryLog(datastreamId, Instant.now(), value);
        historyLogRepo.save(newLog);
        datastreamRepo.findById(datastreamId).ifPresent(datastream -> {
            datastream.setCurrentValue(value);
            datastreamRepo.save(datastream);
        });
        return ResponseEntity.ok("Saved in MongoDB");
    }

}
