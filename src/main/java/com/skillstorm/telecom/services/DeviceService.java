package com.skillstorm.telecom.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.skillstorm.telecom.beans.Device;
import com.skillstorm.telecom.data.DeviceRepository;

@Service
public class DeviceService {

	@Autowired
	DeviceRepository repo;
	
	public List<Device> findAll() {
		return repo.findAll();
	}
	
	public Device save(Device device) {
		return repo.save(device);
	}
	
	public void delete(Device device) {
		 repo.delete(device);
	}
	
	@Transactional
	public void updatePhoneNumber(int deviceId, String deviceNumber) {
		 repo.updatePhoneNumber(deviceId, deviceNumber);
	}
}
