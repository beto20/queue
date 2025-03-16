package com.alfa.demo.service;

import com.alfa.demo.entity.Message;
import org.springframework.stereotype.Component;

@Component
public class Transfer {

    public void enqueueWithPriority(Message message) {
        if (message.getPriority().equals(com.alfa.demo.entity.Priority.HIGH_PRIORITY)) {

        } else {

        }
    }

    public void enqueueDefault() {

    }
}
