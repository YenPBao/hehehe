package com.IT3180.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.IT3180.model.Resident;

@Repository
public interface ResidentRepository extends JpaRepository{
	Resident findById (Long id);
	
	List<Resident> findByApartmentId(Long apartmentId);
}
