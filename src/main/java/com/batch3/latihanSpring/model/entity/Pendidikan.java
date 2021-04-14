package com.batch3.latihanSpring.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@Entity
@Table(name = "table_pendidikan")

public class Pendidikan {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(unique = true, nullable = false)
	private String kodePendidikan;
	
	@Column
	private String jenjang;
	
	@Column
	private String institusi;
	
	@ManyToOne
	@JoinColumn(name = "username", referencedColumnName = "username" )
	private User user;
	
	//setter getter
	
	

	public String getKodePendidikan() {
		return kodePendidikan;
	}

	public Integer getId() {
		return id;
	}

	public void setKodePendidikan(String kodePendidikan) {
		this.kodePendidikan = kodePendidikan;
	}

	public String getJenjang() {
		return jenjang;
	}

	public void setJenjang(String jenjang) {
		this.jenjang = jenjang;
	}

	public String getInstitusi() {
		return institusi;
	}

	public void setInstitusi(String institusi) {
		this.institusi = institusi;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	

}
