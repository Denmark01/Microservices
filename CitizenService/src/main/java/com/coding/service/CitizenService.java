package com.coding.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.coding.entity.Citizen;
import com.coding.entity.RequiredReponse;
import com.coding.entity.VaccineDto;
import com.coding.repository.CitizenRepo;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class CitizenService {
	
	@Autowired
	CitizenRepo repo;	
	
	@Autowired
	RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod = "handleVaccineDownTime")
	public RequiredReponse getCitizen(int id) {
		RequiredReponse response = new RequiredReponse();
		Citizen citz = repo.findById(id);
		response.setCitizenDto(citz);
 		List<VaccineDto> list = restTemplate.getForObject("http://VACCINE-DIVE/Vaccine-dtls/getAll", List.class);
 		response.setVaccineDto(list);
		return response;
	}
	
public Citizen saveCitizen(Citizen ctzCitizen) {
		
		Citizen citz = repo.save(ctzCitizen);
		return citz;
	}

	public RequiredReponse handleVaccineDownTime(int id) {
		RequiredReponse response = new RequiredReponse();
		Citizen citz = repo.findById(id);
		response.setCitizenDto(citz);
		
		return response;
	}
}
