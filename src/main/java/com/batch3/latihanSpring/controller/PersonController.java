package com.batch3.latihanSpring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.batch3.latihanSpring.model.dto.PersonDto;
import com.batch3.latihanSpring.model.entity.PersonEntity;
import com.batch3.latihanSpring.repository.PersonRepository;
import com.batch3.latihanSpring.service.PersonService;


@RestController
@RequestMapping("/v1")

public class PersonController {
	@Autowired
	private PersonRepository personRepository;
	
	@Autowired
	private PersonService personService;
	
	
	//get all persons
	@GetMapping("/persons")
	public List<?> getPersons(){
		List<PersonEntity> persons = personRepository.findAll();
//		List<String> firstName = personRepository.getFirstName();
		return persons;
		
	}
	
	
	//Insert Person Data
	@PostMapping("/insert/person2")
	public ResponseEntity<?> insertPerson(@RequestBody PersonDto personDto){
//		PersonEntity personEntity = new PersonEntity();
//		
//		personEntity.setFirstName(personDto.getFirstName());
//		personEntity.setLastName(personDto.getLastName());
//		personEntity.setDomisili(personDto.getDomisili());
//		personEntity.setTanggalLahir(personDto.getTanggalLahir());
		
		//TRANSFER DATA MELALUI SERVICE
		PersonEntity personEntity = personService.insertData(personDto);
//		personRepository.save(personEntity);
		return ResponseEntity.ok(personEntity);
	}
	
	
	//Get by id
	@GetMapping("/person/{id}")
	public ResponseEntity<?> getPerson (@PathVariable Integer id){
		PersonEntity personEntity = personRepository.findById(id).get();
//		String pString = personRepository.getFirstName(id);
		return ResponseEntity.ok(personEntity);
	}
	
	//Update
	@PutMapping("/update/person/{id}")
	public ResponseEntity<?> update(@PathVariable Integer id, @RequestBody PersonDto dto){
//		PersonEntity personEntity = personRepository.findById(id).get();
//		
//		personEntity.setFirstName(dto.getFirstName());
//		personEntity.setLastName(dto.getLastName());
//		personEntity.setDomisili(dto.getDomisili());
//	    personEntity.setTanggalLahir(dto.getTanggalLahir());
		
//		personRepository.save(personEntity);
		
		PersonEntity personEntity = personService.updateData(id, dto);
		return ResponseEntity.ok(personEntity);	
	}
	
	
	
	//Delete
	@DeleteMapping("/delete/person/{id}")
	public ResponseEntity<?> delete(@PathVariable Integer id){
		PersonEntity personEntity = personRepository.findById(id).get();
		personRepository.delete(personEntity);
		
		return ResponseEntity.ok(personEntity);
	}
}














