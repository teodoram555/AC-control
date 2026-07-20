package com.example.demo.domain.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Setter
@Getter
public class Device {
    @Id
    private String idDevice;
    private String userId;
    private String authToken;
    private String deviceName;
    private String connection;

    public Device(){

    }
    public Device(String userId,String authToken,String deviceName,String connection){
        this.userId=userId;
        this.authToken=authToken;
        this.deviceName=deviceName;
        this.connection=connection;
    }

}
