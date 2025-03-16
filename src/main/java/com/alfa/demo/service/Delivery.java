package com.alfa.demo.service;

import com.alfa.demo.entity.Message;
import org.springframework.stereotype.Component;

@Component
public class Delivery {

    public void dequeueWithPriority(Message message) {
        if (message.getPriority().equals(com.alfa.demo.entity.Priority.HIGH_PRIORITY)) {

        } else {

        }
    }

    public void dequeueDefault(Message message) {

    }
}
