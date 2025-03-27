package com.IT3180.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.IT3180.model.Role;
import com.IT3180.model.Apartment; 

@Repository
public interface ApartmentRepository extends JpaRepository <Apartment, Long>{
	Apartment findById (String id);
}
