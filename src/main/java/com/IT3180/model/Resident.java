package com.IT3180.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "resident")
public class Resident {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(nullable = false, unique = true)
	private String fullname;
	
    @ManyToOne
    @JoinColumn(name = "apartment_id") 
    private Apartment apartment;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public Apartment getApartment() {
		return apartment;
	}

	public void setApartment(Apartment apartment) {
		this.apartment = apartment;
	}

	public Resident(Long id, String fullname, Apartment apartment) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.apartment = apartment;
		apartment.addResident(this);
	}
	
	

	public Resident(Long id, String fullname) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.apartment.addResident(this);
	}

	public Resident() {
		super();
		this.apartment.addResident(this);
		// TODO Auto-generated constructor stub
	}
	
    
}
