package com.batch3.latihanSpring.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PendidikanDto {
	private String kodePendidikan;
	private String jenjang;
	private String institusi;
	private String username;
	
	
	public PendidikanDto(String kodePendidikan, String jenjang, String institusi, String username) {
		super();
		this.kodePendidikan = kodePendidikan;
		this.jenjang = jenjang;
		this.institusi = institusi;
		this.username = username;
	}
	
	public PendidikanDto() {
		
	}
	
	
	//setter getter
	public String getKodePendidikan() {
		return kodePendidikan;
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	

}
