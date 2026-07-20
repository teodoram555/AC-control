package com.example.demo.domain.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.time.Instant;
@Setter
@Getter
public class HistoryLog {
    @Id
    private String idLog;
    private String datastreamId;
    private java.time.Instant timestamp;
    private double recordedValue;

    public HistoryLog(){

    }
    public HistoryLog(String datastreamId, Instant timestamp,double recordedValue){
        this.datastreamId=datastreamId;
        this.timestamp=timestamp;
        this.recordedValue=recordedValue;
    }


}
