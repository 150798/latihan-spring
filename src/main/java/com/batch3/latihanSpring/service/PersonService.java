package com.batch3.latihanSpring.service;

import com.batch3.latihanSpring.model.dto.PersonDto;
import com.batch3.latihanSpring.model.entity.PersonEntity;

public interface PersonService {
	//isinya utk transfer data
	public PersonEntity insertData(PersonDto dto);
	public PersonEntity updateData (Integer id, PersonDto dto);

}
