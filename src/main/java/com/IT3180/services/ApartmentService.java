package com.IT3180.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.IT3180.model.Apartment;
import com.IT3180.repository.ApartmentRepository;
import com.IT3180.repository.UserRepository;

@Service
public class ApartmentService {
	@Autowired
	ApartmentRepository apartmentRepository;
	
	@Autowired
	UserRepository userRepository;
	
	public List<Apartment> getAllApartment()
	{
		return apartmentRepository.findAll();
	}
	
	
}
