package com.alfa.demo.service;

import com.alfa.demo.entity.Message;
import com.alfa.demo.entity.Status;

public class DeadLetter<T> extends Queue<T> {

    public Status sendToDLQ(Message message) {


        return Status.REGISTERED_ON_DEAD_LETTER;
    }

}
