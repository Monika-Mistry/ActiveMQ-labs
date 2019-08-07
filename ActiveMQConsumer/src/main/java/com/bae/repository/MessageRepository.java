package com.bae.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bae.domain.ConsumedMessage;

@Repository
public interface MessageRepository extends MongoRepository<ConsumedMessage, String>{

}
