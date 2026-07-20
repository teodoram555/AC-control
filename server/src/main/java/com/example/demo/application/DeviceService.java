package com.example.demo.application;

import com.example.demo.domain.model.Device;
import com.example.demo.domain.repo.DeviceRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class DeviceService {
    private final DeviceRepo deviceRepo;
    public Device createDevice(Device newDevice){
        return deviceRepo.save(newDevice);
    }
}
