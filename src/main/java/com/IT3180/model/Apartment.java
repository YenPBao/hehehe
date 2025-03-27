package com.IT3180.model;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "apartment")
public class Apartment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "area")
    private Long area;

    @OneToOne(mappedBy = "apartment")
    private User user;
    
    @OneToMany(mappedBy = "apartment")
    private List<Resident> residents = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long apartmentId) {
		this.id = apartmentId;
	}

	public Long getArea() {
		return area;
	}

	public void setArea(Long area) {
		this.area = area;
	}

	public User getUser() {
		return user;
	}
	
	public void addResident(Resident resident) {
	    residents.add(resident);
	    resident.setApartment(this);
	}

	public void setUser(User user) {
		this.user = user;
		user.setApartment(this);
	}

	public List<Resident> getResidents() {
		return residents;
	}

	public void setResidents(List<Resident> residents) {
		this.residents = residents;
	}

	public Apartment(Long apartmentId, Long area, User user) {
		super();
		this.id = apartmentId;
		this.area = area;
		this.user = user;
	}

	public Apartment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Apartment(Long id, Long area, User user, List<Resident> residents) {
		super();
		this.id = id;
		this.area = area;
		this.user = user;
		this.residents = residents;
	}
}
