package com.example.demo;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class DeviceService {
    private final DeviceRepo deviceRepo;
    public Device createDevice( Device newDevice){
        return deviceRepo.save(newDevice);
    }
}
