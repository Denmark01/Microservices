package com.coding.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.coding.model.VaccineDto;

public interface VaccineRepo extends JpaRepository<VaccineDto, Integer>{
	
	public List<VaccineDto> findByVaccineId(int id);
	
//	@Query("select v.vaccine_name from vaccination_details.vaccine_dtls v where v.vaccine_id = ?1")
	public String findByVaccineName(int vaccineId);
	
}
