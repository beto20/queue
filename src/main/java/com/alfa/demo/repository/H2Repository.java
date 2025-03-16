package com.alfa.demo.repository;

import com.alfa.demo.entity.MessageEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface H2Repository extends CrudRepository<MessageEntity, String> {
}
