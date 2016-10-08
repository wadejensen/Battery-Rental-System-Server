package au.com.battery.rental.persistence.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import au.com.battery.rental.persistence.dao.BatteryRepository;
import au.com.battery.rental.persistence.model.Battery;

public class BatteryService {
	
	@Autowired
	private BatteryRepository batteryRepo;
	
	private ArrayList<Battery> findByMachineId(Integer machineId) {
		return batteryRepo.findByMachineId(machineId);
	}
	
	public Battery findById(Integer batteryId) {
		return batteryRepo.findById(batteryId);
	}
	
}