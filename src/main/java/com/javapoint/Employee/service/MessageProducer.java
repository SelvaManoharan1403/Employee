package com.javapoint.Employee.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class MessageProducer implements MessageProducerImpl
{
    private Logger log = LoggerFactory.getLogger(MessageProducer.class);

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;


    private String topic;

    public void sendMessage(String message) {
        log.info("MESSAGE SENT" + message);
        kafkaTemplate.send(topic, message);
    }

}
