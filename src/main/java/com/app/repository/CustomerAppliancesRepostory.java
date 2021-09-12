package com.app.repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;	

import com.app.model.CustomerAppliances;

@Repository
public interface CustomerAppliancesRepostory extends JpaRepository<CustomerAppliances, Long> {

	@Query(value = "select c.name as customerName,a.aid as applianceId,c.address as customerAddress,a.factory_nr as factoryNR from appliance.customer c join appliance.customer_appliances ca on c.id = ca.customer_id join appliance.appliances a on ca.appliance_id = a.aid where a.aid in (:applianceIds) order by c.name asc", nativeQuery = true)
	List<Map<String, Object>> findAllActiveAppliances(List<String> applianceIds);
}
