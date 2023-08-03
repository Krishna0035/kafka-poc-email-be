package com.kafkapoc.kafkapocemail.consumer;

import com.google.gson.Gson;
import com.kafkapoc.kafkapocemail.dto.KafkaEmailDto;
import com.kafkapoc.kafkapocemail.emailservice.EmailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);


    @Autowired
    private Gson gson;

    @Autowired
    private EmailService emailService;

    @KafkaListener(topics = "email_topic_new_1" , groupId = "myGroup2")
    public void emailRequestReceive1(String data){
        KafkaEmailDto kafkaEmailDto = gson.fromJson(data, KafkaEmailDto.class);
        emailService.sendEmail(kafkaEmailDto.getEmail(),kafkaEmailDto.getSubject(),kafkaEmailDto.getBody());
        System.out.println("Received from consumer 1 : "+data);
    }

    @KafkaListener(topics = "email_topic_new_2" , groupId = "myGroup2")
    public void emailRequestReceive2(String data){
//        emailService.sendEmail(data,"Test Subject","Dummy Text");
        KafkaEmailDto kafkaEmailDto = gson.fromJson(data, KafkaEmailDto.class);
        emailService.sendEmail(kafkaEmailDto.getEmail(),kafkaEmailDto.getSubject(),kafkaEmailDto.getBody());
        System.out.println("Received from consumer 2 : "+data);
    }

    @KafkaListener(topics = "email_topic_new_3" , groupId = "myGroup3")
    public void emailRequestReceive3(String data){
//        emailService.sendEmail(data,"Test Subject","Dummy Text");
        KafkaEmailDto kafkaEmailDto = gson.fromJson(data, KafkaEmailDto.class);
        emailService.sendEmail(kafkaEmailDto.getEmail(),kafkaEmailDto.getSubject(),kafkaEmailDto.getBody());
        System.out.println("Received from consumer 3 : "+data);
    }

}
