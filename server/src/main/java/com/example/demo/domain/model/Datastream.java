package com.example.demo.domain.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Setter
@Getter
public class Datastream {
    @Id
    private String idDatastream;
    private String deviceId;
    private String datastreamParam;
    private double currentValue;

    public Datastream(){

    }
    public Datastream(String deviceId,String datastreamParam,double currentValue){
        this.deviceId=deviceId;
        this.datastreamParam=datastreamParam;
        this.currentValue=currentValue;
    }

}
