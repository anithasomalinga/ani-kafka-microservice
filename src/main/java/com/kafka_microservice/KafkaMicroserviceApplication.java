package com.kafka_microservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class KafkaMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaMicroserviceApplication.class, args);
    }

    // KafkaTemplate is dependency injection
    @Bean
    CommandLineRunner commandLineRunner(KafkaTemplate<String, String> kafkaTemplate) {
        return args -> {
            kafkaTemplate.send("science", "Hi Science Kafka Topic, this is Anitha!");
        };
    }
}
