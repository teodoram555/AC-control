package com.example.acControl.application;

import com.example.acControl.domain.model.Device;
import com.example.acControl.domain.repo.DeviceRepo;
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
