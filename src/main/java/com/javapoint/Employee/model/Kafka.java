package com.javapoint.Employee.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Kafka
{
    public  String TOPIC_NAME="java";
    public String GROUP_ID="groupId";
}
