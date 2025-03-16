package com.alfa.demo.mapper;

import com.alfa.demo.entity.Message;
import com.alfa.demo.entity.MessageEntity;

public class MessageMapper {

    public static MessageEntity toEntity(Message message) {
        var entity = new MessageEntity();
        entity.setMessageId(message.getId());
        entity.setBody(message.getBody().toString());
        entity.setHeaders(message.getHeaders().toString());
        entity.setTimestamp(message.getTimestamp());
        entity.setStatus(message.getStatus());
        entity.setSerie(message.getSerie());

        return entity;
    }
}
