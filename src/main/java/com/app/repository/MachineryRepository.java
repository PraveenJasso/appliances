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
	 @Query("update Machinery m set updatedOn=:updatedOn ")
	 void updateMachinery(Timestamp updatedOn);
 
	 @Query("select m from Machinery m where updatedOn < now()")
	 List<Machinery> findAllByUpdatedOn();
}
