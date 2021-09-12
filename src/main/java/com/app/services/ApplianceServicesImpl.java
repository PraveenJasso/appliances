package com.app.services;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.app.exception.ResourceNotFoundException;
import com.app.model.Machinery;
import com.app.repository.CustomerAppliancesRepostory;
import com.app.repository.MachineryRepository;

@Service
public class ApplianceServicesImpl implements ApplianceServices {

	@Autowired
	private CustomerAppliancesRepostory customerAppliancesRepostory;
	
	@Autowired
	private MachineryRepository machineryRepository;

	@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public List<Map<String, Object>> findAllActiveAppliances() throws Exception {
		List<Machinery> machineries = this.machineryRepository.findAllByActive(true);
		if(machineries == null || machineries.isEmpty()) {
			updateMachinery(true);
			throw new ResourceNotFoundException("No Appliances found");
		}
		List<String> applianceIds = new ArrayList<>();
		for (Machinery machinery : machineries) {
			applianceIds.add(machinery.getApplianceId());
		}
		machineryRepository.updateMachineryAsInactive(getIncrementalTime());
		machineryRepository.updateMachineryAsInactive(getIncrementalTime());
		List<Map<String, Object>> appliances = customerAppliancesRepostory.findAllActiveAppliances(applianceIds);
		return appliances;
	}

	private Timestamp getIncrementalTime() {
		Calendar date = Calendar.getInstance();
		System.out.println("Current Date and TIme : " + date.getTime());
		long timeInSecs = date.getTimeInMillis();
		Date afterAddingMins = new Date(timeInSecs + (1 * 60 * 1000));
		return new Timestamp(afterAddingMins.getTime());
	}
	
	@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public void updateMachinery(boolean active) {
		machineryRepository.updateMachinery(getIncrementalTime(),true);
		
	}
	
}
