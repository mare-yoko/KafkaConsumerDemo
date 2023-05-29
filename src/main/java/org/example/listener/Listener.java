package org.example.listener;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Listener {
    @KafkaListener(id = "myId", topics = "test-topic")
    public void listen(ConsumerRecord<String, String> record) {
        System.out.println("key: " + record.key() + ", value: " + record.value());
    }
}
