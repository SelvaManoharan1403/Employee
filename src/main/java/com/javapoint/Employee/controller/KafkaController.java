package com.javapoint.Employee.controller;

import com.javapoint.Employee.repository.KafkaRepo;
import com.javapoint.Employee.service.MessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class KafkaController
{
    @Autowired
    private MessageProducer producer;

    @Autowired
    private KafkaRepo kafkaRepo;

    @GetMapping("/send")
    public String sendMsg(
            @RequestParam("msg") String message) {
        producer.sendMessage(message);
        return "" +"'+message +'" + " sent successfully!";
    }

    @GetMapping("/getAll")
    public String getAllMessages() {
        return kafkaRepo.getAllMessages() ;
    }
}
