package com.skillstorm.telecom.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.skillstorm.telecom.beans.Device;

public interface DeviceRepository extends JpaRepository<Device, Integer>{

	@Modifying
	@Query(value = "update devices set device_number=?2 where device_id=?1", nativeQuery = true)
	public void updatePhoneNumber(int deviceId, String deviceNumber);

}