package com.kafkapoc.kafkapocemail.consumer;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.TopicPartition;

import java.time.Duration;
import java.util.Collections;
import java.util.Properties;

public class KafkaPartitionConsumer {
//    public static void main(String[] args) {
//        // Kafka consumer configuration
//        Properties props = new Properties();
//        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
//        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringDeserializer");
//        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.JsonDeserializer");
//        props.put(ConsumerConfig.GROUP_ID_CONFIG, "myGroup");
//
//        // Create the Kafka consumer
//        KafkaConsumer<String, String> consumer = new KafkaConsumer<>(props);
//
//        // Subscribe to the topic and assign a specific partition
//        String topic = "your-topic-name";
//        int partition = 1; // Replace 0 with the desired partition number
//        TopicPartition topicPartition = new TopicPartition(topic, partition);
//        consumer.assign(Collections.singleton(topicPartition));
//
//        // Start consuming messages
//        while (true) {
//            ConsumerRecords<String, String> records = consumer.poll(Duration.ofMillis(100));
//            for (ConsumerRecord<String, String> record : records) {
//                System.out.println("Received message: " + record.value());
//            }
//        }
//    }
}
