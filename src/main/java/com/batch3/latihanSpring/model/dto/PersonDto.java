package com.batch3.latihanSpring.model.dto;

import java.sql.Date;
import lombok.Data;


@Data

public class PersonDto {
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private String domisili;
	private Date tanggalLahir;
	private String nik;
	private String golDarah;
	
	//Constructor
	public PersonDto() {
	}
	
	public PersonDto(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}


	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDomisili() {
		return domisili;
	}

	public void setDomisili(String domisili) {
		this.domisili = domisili;
	}

	public Date getTanggalLahir() {
		return tanggalLahir;
	}

	public void setTanggalLahir(Date tanggalLahir) {
		this.tanggalLahir = tanggalLahir;
	}

	public String getNik() {
		return nik;
	}

	public void setNik(String nik) {
		this.nik = nik;
	}

	public String getGolDarah() {
		return golDarah;
	}

	public void setGolDarah(String golDarah) {
		this.golDarah = golDarah;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

	
}
