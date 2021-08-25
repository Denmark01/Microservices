package com.coding.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.coding.model.VaccineDto;
import com.coding.repository.VaccineRepo;

@RestController
@RequestMapping("/Vaccine-dtls")
public class VaccinationController {
	
	 private static final Logger logger = LoggerFactory.getLogger(VaccinationController.class);
	@Autowired
	VaccineRepo repo;

	@GetMapping("/get-vaccine-dtls")
	public String getVaccineDetails() {
		return "denmark";
	}
	
	@RequestMapping("/save")
	public ResponseEntity<VaccineDto> saveVaccine(@RequestBody VaccineDto dto) {
		logger.info("method invoked SaveVaccine");
		VaccineDto list = repo.save(dto);
		return new ResponseEntity<>(list, HttpStatus.OK);
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<List<VaccineDto>> getVaccineDtls(@PathVariable int id) {
		List<VaccineDto> list = repo.findByVaccineId(id);
		return new ResponseEntity<>(list, HttpStatus.OK);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<VaccineDto>> getAllVaccine() {
		List<VaccineDto> list = repo.findAll();
		return new ResponseEntity<>(list, HttpStatus.OK);
	}
	
	@GetMapping("/getVaccineNameById")
	public ResponseEntity<String> getAllVaccine(@RequestParam("vid") int id) {
		String name = repo.findByVaccineName(id);
		return new ResponseEntity<>(name, HttpStatus.OK);
	}
}
