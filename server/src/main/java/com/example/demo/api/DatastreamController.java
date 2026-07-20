package com.example.demo.api;

import com.example.demo.domain.model.Datastream;
import com.example.demo.application.DatastreamService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/datastream")
@AllArgsConstructor
public class DatastreamController {
    private final DatastreamService datastreamService;

    @PostMapping("/add")
    public ResponseEntity<Datastream> addDatastream(@RequestBody Datastream datastream){
        Datastream savedDatastream=datastreamService.createDatastream(datastream);
        return ResponseEntity.ok(savedDatastream);
    }
}
