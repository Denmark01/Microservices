package com.coding.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coding.entity.Citizen;

public interface CitizenRepo extends JpaRepository<Citizen, Integer>{
	
	public Citizen findById(int id);

}
