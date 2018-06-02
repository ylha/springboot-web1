package com.springbootrabbitmq.demo.com.test;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.core.RabbitManagementTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Date;
@Component
public class HelloSender {
    @Autowired
    private AmqpTemplate template;
    public void send(){
        String context = "hello " + new Date();
        System.out.println("Sender : " + context);
        this.template.convertAndSend("hello", context);
    }
}
