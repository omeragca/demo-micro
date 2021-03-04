package org.example.kafka.service;

import org.example.kafka.model.dto.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class KafkaReceiver {

    @Autowired
    private RestTemplate restTemplate;

    @KafkaListener(topics = "demo-micro_topic")
    public void listen(String text) {
        System.out.println("Received message in group foo: " + text);
        restTemplate.postForLocation("http://message-service/api/msg/",
                new Message(text, text));
        System.out.println("Sent to message service");
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
