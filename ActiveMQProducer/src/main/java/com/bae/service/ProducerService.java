package com.bae.service;

import org.springframework.stereotype.Service;

import com.bae.domain.Message;

@Service
public class ProducerService {
	
	public Message getMessage() {
		Message message = new Message("Hello World");
		return message;
	}
	

}
