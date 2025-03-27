package com.IT3180.dto;

import com.IT3180.model.Apartment;

import jakarta.validation.constraints.NotEmpty;

public class ResidentDTO {
	private Long id;
	private Apartment apartment;
	@NotEmpty
	private String fullname;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Apartment getApartment() {
		return apartment;
	}
	public void setApartment(Apartment apartment) {
		this.apartment = apartment;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public ResidentDTO(Long id, Apartment apartment, @NotEmpty String fullname) {
		super();
		this.id = id;
		this.apartment = apartment;
		this.fullname = fullname;
	}
	public ResidentDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	 
}
