package com.batch3.latihanSpring.repository;


import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.batch3.latihanSpring.model.entity.PersonEntity;

@Repository
public interface PersonRepository extends JpaRepository<PersonEntity, Integer> {
	@Query (value = "select first_name from table_person", nativeQuery = true)
	public List<String> getFirstName();
	
	@Query (value = "select first_name from table_person where id = ?", nativeQuery = true)
	public String getFirstName(Integer id);
}

