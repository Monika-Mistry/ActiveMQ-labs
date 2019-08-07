package com.bae.domain;

import org.springframework.data.annotation.Id;


public class ConsumedMessage {
	
	private Long id;
	
	private String message;
	
	public ConsumedMessage() {
	}
	
	public ConsumedMessage(String message) {
		this.message = message;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	

}

