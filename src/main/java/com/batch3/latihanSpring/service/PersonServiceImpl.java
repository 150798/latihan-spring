package com.batch3.latihanSpring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.batch3.latihanSpring.model.dto.PersonDto;
import com.batch3.latihanSpring.model.entity.PersonEntity;
import com.batch3.latihanSpring.repository.PersonRepository;

@Service
@Transactional


public class PersonServiceImpl implements PersonService {
	@Autowired
	private PersonRepository personRepository;
	
	@Override
	public PersonEntity insertData(PersonDto personDto) {
		PersonEntity personEntity = new PersonEntity();
		
		if (!personDto.getFirstName().isEmpty()) {
			//convert dtonya ke entity
			personEntity.setFirstName(personDto.getFirstName());
			personEntity.setLastName(personDto.getLastName());
			personEntity.setDomisili(personDto.getDomisili());
			personEntity.setTanggalLahir(personDto.getTanggalLahir());
			
			personRepository.save(personEntity);
			return personEntity;
		}
		return null;
	}
	
	
	@Override
	public PersonEntity updateData(Integer id, PersonDto dto) {
		PersonEntity personEntity = personRepository.findById(id).get();
		
		personEntity.setFirstName(dto.getFirstName());
		personEntity.setLastName(dto.getLastName());
		personEntity.setDomisili(dto.getDomisili());
		personEntity.setTanggalLahir(dto.getTanggalLahir());
		
		personRepository.save(personEntity);
		return personEntity;
	}

}
