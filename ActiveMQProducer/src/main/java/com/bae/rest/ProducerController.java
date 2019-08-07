package com.bae.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bae.domain.Message;
import com.bae.domain.SentMessage;
import com.bae.service.ProducerService;

@RestController
public class ProducerController {
	
	private ProducerService service;
	private JmsTemplate jmsTemplate;
	
	@Autowired
	public ProducerController(ProducerService service, JmsTemplate jmsTemplate) {
		this.service = service;
		this.jmsTemplate = jmsTemplate;
	}

	@PostMapping
	public Message sendMessage() {
		Message message = service.getMessage();
		sendToQueue(message);
		return message;
	}
	
	private void sendToQueue(Message message) {
		SentMessage sentMessage = new SentMessage(message);
		jmsTemplate.convertAndSend("AccountQueue", sentMessage);
	}
}
  