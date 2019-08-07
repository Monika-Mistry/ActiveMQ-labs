package com.bae.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="consumedMessage")
public class ConsumedMessage {
	
	@Id
	private String id;
	private String message;
	
	public ConsumedMessage() {
	}
	
	public ConsumedMessage(String message) {
		this.message = message;
	}


	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	

}

