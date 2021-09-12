package com.app.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Data
@Entity
@Table(name = "machinery")
public class Machinery {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "applianceId")
	private String applianceId;
	@Column(name = "active")
	private boolean active;
	@Column(name = "updated_on")
	private Timestamp updatedOn;
}
