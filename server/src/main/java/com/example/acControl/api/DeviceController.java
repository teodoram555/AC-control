package com.example.acControl.api;

import com.example.acControl.domain.model.Device;
import com.example.acControl.application.DeviceService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/device")
@AllArgsConstructor
public class DeviceController {
    private final DeviceService deviceService;

    @PostMapping("/add")
    public ResponseEntity<Device> addDevice(@RequestBody Device device){
        Device savedDevice = deviceService.createDevice(device);
        return ResponseEntity.ok(savedDevice);
    }
}
