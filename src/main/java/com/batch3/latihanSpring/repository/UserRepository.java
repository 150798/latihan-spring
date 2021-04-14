package com.batch3.latihanSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.batch3.latihanSpring.model.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	public User findByUsername(String username);
}
