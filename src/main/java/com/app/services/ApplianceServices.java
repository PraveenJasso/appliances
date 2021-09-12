package com.app.services;

import java.util.List;
import java.util.Map;

public interface ApplianceServices {
	
	List<Map<String, Object>> findAllActiveAppliances() throws Exception;
	
	void updateMachinery();
}
