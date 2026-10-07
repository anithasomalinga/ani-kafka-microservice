package com.kafka_microservice;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {
    @KafkaListener(topics = "science", groupId = "G1")
    void listener(String data) {
        System.out.println("Listener received data: " + data + " .Yayyyy!!!");
    }
}
