package com.kafkapoc.kafkapocemail.consumer;

import com.google.gson.Gson;
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

    @KafkaListener(topics = "email_1" , groupId = "myGroup")
    public void emailRequestReceive1(String data){





        System.out.println("Received from consumer 1 : "+data);
    }

    @KafkaListener(topics = "email_1" , groupId = "myGroup")
    public void emailRequestReceive2(String data){
        System.out.println("Received from consumer 2 : "+data);
    }


}
