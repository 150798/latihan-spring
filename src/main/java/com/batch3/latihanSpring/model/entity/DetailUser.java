package com.batch3.latihanSpring.model.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "table_detail_user")


public class DetailUser {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private String firstName;

	@Column
	private String lastName;
	
	@Column
	private String  nik;
	
	@Column
	private String domisili;
	
	@Column
	private Date tanggalLahir;
	
	@Column
	private String golDarah;
	
	@OneToOne
	@JoinColumn(name="userId")
	private User user;

	
	
	public DetailUser(String firstName, String lastName, String nik, String domisili, Date tanggalLahir,
			String golDarah) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.nik = nik;
		this.domisili = domisili;
		this.tanggalLahir = tanggalLahir;
		this.golDarah = golDarah;
	}
	
	public DetailUser() {
	}


	public Integer getId() {
		return id;
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



	public String getNik() {
		return nik;
	}



	public void setNik(String nik) {
		this.nik = nik;
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



	public String getGolDarah() {
		return golDarah;
	}



	public void setGolDarah(String golDarah) {
		this.golDarah = golDarah;
	}



	public User getUser() {
		return user;
	}



	public void setUser(User user) {
		this.user = user;
	}
	
	
	//setter getter
	
	
}
