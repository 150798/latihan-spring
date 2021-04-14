package com.batch3.latihanSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.batch3.latihanSpring.model.entity.Pendidikan;
import com.batch3.latihanSpring.model.entity.User;

public interface PendidikanRepository extends JpaRepository<Pendidikan, Integer> {
}


