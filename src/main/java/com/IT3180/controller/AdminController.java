package com.IT3180.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.IT3180.dto.UserDTO;
import com.IT3180.model.Apartment;
import com.IT3180.model.Resident;
import com.IT3180.services.ApartmentService;
import com.IT3180.services.ResidentService;
import com.IT3180.services.UserService;

@Controller
@RequestMapping ("/admin")
public class AdminController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private ApartmentService apartmentService;

	@Autowired
	private ResidentService residentService;
	 @GetMapping("/dashboard")
	    public String dashboard() 
	 	{
	        return "admin/admin_dashboard";  
	    }
	 
	@GetMapping("/account")
	public String account (Model model)
	{
		List<Apartment> apartments = apartmentService.getAllApartment();
		model.addAttribute("apartments",apartments );
		List<com.IT3180.model.User> users = userService.getAllUsers();
    	model.addAttribute("users", users);
   		return "admin/account";
	}
	
	@GetMapping ("/resident")
	public String resident(Model model)
	{
		List<Apartment> apartments = apartmentService.getAllApartment();
		List<Resident> residents = residentService.getAllResidents();	
		model.addAttribute("apartments",apartments );
		return "admin/resident";
	}
	
	 @PostMapping("/account/delete/{id}")
	 public String deleteAccount(@PathVariable Long id) 
	 {
	        userService.deleteUser(id);  
	        return "redirect:/admin/account";  
	 }
	 
	 @PostMapping("/account/save")
	    public String saveUser(@ModelAttribute UserDTO userDto) {

	        userService.saveUser(userDto);
	        return "redirect:/admin/account";
	  }

   
}
