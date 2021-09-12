package com.app.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class CustomerAppliancesDTO {

	
	private long id;
	private String customerName;
	private String customerAddress;
	private String applianceId;
	private String factoryNR;
}
