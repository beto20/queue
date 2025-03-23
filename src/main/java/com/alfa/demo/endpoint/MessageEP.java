package com.alfa.demo.endpoint;


import com.alfa.demo.entity.Message;
import com.alfa.demo.service.QueueStarter;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class MessageEP {

//    @Bean
    public String mock() {
        QueueStarter<Object> infraQueue = new QueueStarter<Object>("QueueStarter1");
        System.out.println("QUEUE START: " + infraQueue.getName());

        Message<String> message = new Message<>();
        message.setBody("PRUEBA 1");

        Message<String> message2 = new Message<>();
        message2.setBody("PRUEBA 2");

        Message<String> message3 = new Message<>();
        message3.setBody("PRUEBA 3");

        Message<String> message4 = new Message<>();
        message4.setBody("PRUEBA 4");

        Message<String> message5 = new Message<>();
        message5.setBody("PRUEBA 5");


        infraQueue.getQueue().enqueue(message);
        infraQueue.getQueue().enqueue(message2);
        infraQueue.getQueue().enqueue(message3);
        infraQueue.getQueue().enqueue(message4);
        infraQueue.getQueue().enqueue(message5);

        System.out.println("ALL VALUES: " + infraQueue.getQueue().showAll());
        return "TEST";
    }
}
