package com.alfa.demo.repository;

import com.alfa.demo.entity.Message;
import com.alfa.demo.mapper.MessageMapper;
import org.springframework.stereotype.Repository;

@Repository
public class Persistence {

    private final H2Repository repository;
    public Persistence(H2Repository repository) {
        this.repository = repository;
    }

    public void memoryPersistence(Message message) {
        var entity = MessageMapper.toEntity(message);
        repository.save(entity);
    }

}
