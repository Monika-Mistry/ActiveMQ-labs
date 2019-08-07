package com.bae.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.bae.domain.ConsumedMessage;
import com.bae.repository.MessageRepository;

@Component
public class MessageListener {
	
	private MessageRepository repository;

	@Autowired
	public MessageListener(MessageRepository repository) {
		this.repository = repository;
	}
	
	
	 @JmsListener(destination = "AccountQueue", containerFactory = "jmsFactory")
	 public void receiveMessage(ConsumedMessage message){
		 System.out.println("Received <" + message + ">");
		 
		 repository.save(message);
		 
		 System.out.println(message + " processed ...");

	 }

}
