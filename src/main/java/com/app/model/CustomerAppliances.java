package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "customer_appliances")
public class CustomerAppliances {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "customer_id")
	private long customerId;
	@Column(name = "appliance_id")
	private String applicanceId;
}
