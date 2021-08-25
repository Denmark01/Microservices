package com.coding.entity;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequiredReponse {

	private List<VaccineDto> vaccineDto;
	
	private Citizen citizenDto;

	

	public List<VaccineDto> getVaccineDto() {
		return vaccineDto;
	}

	public void setVaccineDto(List<VaccineDto> vaccineDto) {
		this.vaccineDto = vaccineDto;
	}

	public Citizen getCitizenDto() {
		return citizenDto;
	}

	public void setCitizenDto(Citizen citizenDto) {
		this.citizenDto = citizenDto;
	}
	
	
}
