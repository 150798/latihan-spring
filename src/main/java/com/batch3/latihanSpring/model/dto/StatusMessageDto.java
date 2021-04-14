package com.batch3.latihanSpring.model.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class StatusMessageDto<T> {
	private Integer status;
	private String message;
	private T data;
	
	
	public StatusMessageDto(Integer status, String message, T data) {
		super();
		this.status = status;
		this.message = message;
		this.data = data;
	}


	public Integer getStatus() {
		return status;
	}


	public void setStatus(Integer status) {
		this.status = status;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public T getData() {
		return data;
	}


	public void setData(T data) {
		this.data = data;
	}
	
	
	
	
	

}
