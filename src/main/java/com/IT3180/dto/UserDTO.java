package com.IT3180.dto;

import java.util.ArrayList;
import java.util.List;

import com.IT3180.model.Role;

import jakarta.validation.constraints.NotEmpty;

public class UserDTO {
	 private Long id;

	 @NotEmpty(message = "Nhập tên hợp lệ")
	 private String name;
	 
	 private List<Role> roles = new ArrayList<>();   
	 public UserDTO() {
		super();
		// TODO Auto-generated constructor stub
	}



	public UserDTO(Long id, @NotEmpty(message = "Nhập tên hợp lệ") String name, List<Role> roles,
			@NotEmpty(message = "Nhập mật khẩu hợp lệ") String password) {
		super();
		this.id = id;
		this.name = name;
		this.roles = roles;
		this.password = password;
	}

	@NotEmpty(message = "Nhập mật khẩu hợp lệ")
	 	private String password;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}


}
