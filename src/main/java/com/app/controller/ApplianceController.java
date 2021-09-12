package com.app.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.services.ApplianceServices;

@Controller // This means that this class is a Controller
@RequestMapping(path = "/appliance")
public class ApplianceController {

	@Autowired
	ApplianceServices applianceServices;

	@GetMapping
	public ResponseEntity<List<Map<String, Object>>> getApplianceDetails() throws Exception {
			List<Map<String, Object>> appliances = this.applianceServices.findAllActiveAppliances();
			return new ResponseEntity<List<Map<String, Object>>>(appliances, HttpStatus.OK);
	}
}
