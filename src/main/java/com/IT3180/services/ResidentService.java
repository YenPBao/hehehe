package com.IT3180.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.IT3180.repository.ResidentRepository;
import com.IT3180.model.Resident;
@Service
public class ResidentService {
	 	@Autowired
	    private ResidentRepository residentRepository;

	    public List<Resident> getResidentsByApartmentId(Long apartmentId) {
	        return residentRepository.findByApartmentId(apartmentId);
	    }
	    
	    public List<Resident> getAllResidents ()
	    {
	    	return residentRepository.findAll();
	    }
}
