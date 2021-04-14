package com.batch3.latihanSpring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.batch3.latihanSpring.model.dto.LoginDto;
import com.batch3.latihanSpring.model.dto.PersonDto;
import com.batch3.latihanSpring.model.dto.StatusMessageDto;
import com.batch3.latihanSpring.model.entity.DetailUser;
import com.batch3.latihanSpring.model.entity.User;
import com.batch3.latihanSpring.repository.DetailUserRepository;
import com.batch3.latihanSpring.repository.UserRepository;
import com.batch3.latihanSpring.service.UserService;

@RestController
@RequestMapping("/v1")

public class UserController {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private DetailUserRepository detailUserRepository;
	@Autowired 
	private UserService userService;
	
	@PostMapping("/registrasi")
	public ResponseEntity<?> regis(@RequestBody PersonDto dto){
		StatusMessageDto<User> result = new StatusMessageDto<>();
		
		try {
			return userService.regisUser(dto);
			
	} catch (Exception e) {
		result.setMessage(e.getMessage());
		return ResponseEntity.badRequest().body(result);
		
		}
	}
	
	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody LoginDto dto){
		return null;
	}

}
