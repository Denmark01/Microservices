package com.coding.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coding.entity.Citizen;
import com.coding.entity.RequiredReponse;
import com.coding.service.CitizenService;

@RestController
@RequestMapping("/Citizen")
public class CitizenController {
	
	@Autowired
	CitizenService citzService;
	
	@GetMapping("/get/{id}")
	public RequiredReponse getId(@PathVariable int id) {
		
		RequiredReponse citz = citzService.getCitizen(id);
		
		return citz;
	}
	
	@PostMapping("/save-citizen")
	public Citizen getAll(@RequestBody Citizen ctz) {
		Citizen citz = citzService.saveCitizen(ctz);
		return citz;
	}
	

}
