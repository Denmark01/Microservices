package com.coding.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="vaccine_dtls")
public class VaccineDto{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="vaccine_id")
	@JsonProperty("vaccine_id")
	private int vaccineId;
	
	@Column(name="vaccine_name")
	@JsonProperty("vaccine_name")
	private String vaccineName;
	
//	
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public int getVaccineId() {
//		return vaccineId;
//	}
//
//	public void setVaccineId(int vaccineId) {
//		this.vaccineId = vaccineId;
//	}
//
//	public String getVaccineName() {
//		return vaccineName;
//	}
//
//	public void setVaccineName(String vaccineName) {
//		this.vaccineName = vaccineName;
//	}
}
