package com.skillstorm.telecom.controllers;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.telecom.beans.Device;
import com.skillstorm.telecom.services.DeviceService;

@RestController
@RequestMapping("telecom/v1")
@CrossOrigin(origins = "http://localhost:4200") // allow requests from a specified host
public class DeviceController {

	@Autowired
	DeviceService service;
	
	// Logging level: Trace, Debug, Info, Warn, Error, and Fatal
	Logger log;
	
	@GetMapping
	public ResponseEntity<List<Device>> findAllDevices() {
		
		List<Device> allDevices = service.findAll();
		
		return new ResponseEntity<>(allDevices, HttpStatus.OK);
	}
	
	@PostMapping("device")
	public ResponseEntity<Device> saveDevice(@RequestBody Device device) {
		
		Device newDevice = service.save(device);
		
		return new ResponseEntity<>(newDevice, HttpStatus.CREATED);
	}
	
	/* updateDevice() implementation */
	
	
	@DeleteMapping
	public ResponseEntity<Device> deleteDevice(@RequestBody Device device) {
		
		service.delete(device);
		
		return new ResponseEntity<>(device, HttpStatus.OK);
	}
	
	@PutMapping("device/{deviceId}/{deviceNumber}")
	public ResponseEntity<Device> updatePhoneNumber(@PathVariable int deviceId, @PathVariable String deviceNumber) {
		
		service.updatePhoneNumber(deviceId, deviceNumber);
		
		return new ResponseEntity<>(HttpStatus.ACCEPTED);
	}
	
}
