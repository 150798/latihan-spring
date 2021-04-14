package com.batch3.latihanSpring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.batch3.latihanSpring.model.dto.PersonDto;
import com.batch3.latihanSpring.model.dto.StatusMessageDto;
import com.batch3.latihanSpring.model.entity.DetailUser;
import com.batch3.latihanSpring.model.entity.User;
import com.batch3.latihanSpring.repository.DetailUserRepository;
import com.batch3.latihanSpring.repository.UserRepository;

@Service
@Transactional

public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private DetailUserRepository detailUserRepository;
	
	@Override
	public ResponseEntity<?> regisUser(PersonDto dto) {
		
		StatusMessageDto<User> result = new StatusMessageDto<>();
		
		if(dto.getNik().length() != 16) {
			result.setStatus(HttpStatus.BAD_REQUEST.value());
			result.setMessage("NIK harus berjalan 16 angka");
			return ResponseEntity.badRequest().body(result);
		}
		
		User user = new User();
	    DetailUser detailUser = new DetailUser();
		
	    user.setUsername(dto.getUsername());
	    user.setPassword(dto.getPassword());
	    userRepository.save(user);
		
	    detailUser.setFirstName(dto.getFirstName());
	    detailUser.setLastName(dto.getLastName());
	    detailUser.setNik(dto.getNik());
	    detailUser.setDomisili(dto.getDomisili());
	    detailUser.setTanggalLahir(dto.getTanggalLahir());
	    detailUser.setGolDarah(dto.getGolDarah());		
		detailUser.setUser(user);
		detailUserRepository.save(detailUser);
		
		result.setStatus(HttpStatus.OK.value());
		result.setMessage("Data berhasil tersimpan!");
		result.setData(user);
		return ResponseEntity.ok(result);
		
	}
}
