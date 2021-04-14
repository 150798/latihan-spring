package com.batch3.latihanSpring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.batch3.latihanSpring.model.dto.PendidikanDto;
import com.batch3.latihanSpring.model.entity.Pendidikan;
import com.batch3.latihanSpring.model.entity.User;
import com.batch3.latihanSpring.repository.PendidikanRepository;
import com.batch3.latihanSpring.repository.UserRepository;

@RestController
@RequestMapping("/v1")

public class PendidikanController {
	@Autowired
	private PendidikanRepository pendidikanRepository;
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("/insert/pendidikan")
	public ResponseEntity<?> insertPendidikan(@RequestBody PendidikanDto dto){
		Pendidikan pendidikan = new Pendidikan();
		pendidikan.setInstitusi(dto.getInstitusi());
		pendidikan.setJenjang(dto.getJenjang());
		
		pendidikanRepository.save(pendidikan);
		pendidikan.setKodePendidikan("p" +pendidikan.getId());
		
		User user = userRepository .findByUsername(dto.getUsername());
		pendidikan.setUser(user);
		pendidikanRepository.save(pendidikan);
		return ResponseEntity.ok(pendidikan);
	}
	
	@GetMapping("/pendidikan-all")
	public ResponseEntity<?> getAll(){
		List<Pendidikan> pendidikans = pendidikanRepository.findAll();
		return ResponseEntity.ok(pendidikans);
	}

}
