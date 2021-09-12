package com.app.repository;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.model.Machinery;

@Repository
public interface MachineryRepository extends JpaRepository<Machinery, Long> {
		
	 @Modifying
	 @Query("update Machinery m set m.active = :active,updatedOn=:updatedOn ")
	 void updateMachinery(Timestamp updatedOn,boolean active);
	 
	 @Modifying
	 @Query("update Machinery m set m.active = false,updatedOn=:updatedOn where m.active is true ")
	 void updateMachineryAsInactive(Timestamp updatedOn);
	 
	 @Modifying
	 @Query("update Machinery m set m.active = true,updatedOn=:updatedOn where m.active is false ")
	 void updateMachineryAsActive(Timestamp updatedOn);
	 
	 @Query("select m from Machinery m where m.active=:active")
	 List<Machinery> findAllByActive(boolean active);
}
