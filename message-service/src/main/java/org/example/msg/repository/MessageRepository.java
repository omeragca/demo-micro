package org.example.msg.repository;

import org.example.msg.model.dto.Message;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MessageRepository extends MongoRepository<Message, String> {

}
