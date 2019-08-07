package com.bae.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bae.domain.Message;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long>{

}
