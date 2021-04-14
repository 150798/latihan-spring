package com.batch3.latihanSpring.service;

import org.springframework.http.ResponseEntity;

import com.batch3.latihanSpring.model.dto.PersonDto;
import com.batch3.latihanSpring.model.dto.StatusMessageDto;
import com.batch3.latihanSpring.model.entity.User;

public interface UserService {
	public ResponseEntity<?> regisUser(PersonDto dto);

}
