package com.javapoint.Employee.repository;

import com.javapoint.Employee.model.Kafka;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface KafkaRepo extends MongoRepository<Kafka,String>
{
    List<String> list = new ArrayList<>();

    public default void addMessage(String message) {
        list.add(message);
    }

    public default String getAllMessages() {
        return list.toString();
    }
}
