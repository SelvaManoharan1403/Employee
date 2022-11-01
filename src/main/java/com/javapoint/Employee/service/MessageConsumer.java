package com.javapoint.Employee.service;

import com.javapoint.Employee.repository.KafkaRepo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageConsumer implements MessageConsumerImpl
{
    private Logger log = LoggerFactory.getLogger(MessageConsumer.class);

    @Autowired
    private KafkaRepo kafkaRepo;

    public void consume(String message) {
        log.info("MESSAGE RECEIVED" + message);
        kafkaRepo.addMessage(message);
    }
}
