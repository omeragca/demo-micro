package org.example.kafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaReceiver {

    @KafkaListener(topics = "demo-micro_topic")
    public void listen(String message) {
        System.out.println("Received Message in group foo: " + message);
    }

}
