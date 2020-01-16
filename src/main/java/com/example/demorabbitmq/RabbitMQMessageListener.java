package com.example.demorabbitmq;

import java.nio.charset.Charset;

import com.google.gson.Gson;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RabbitMQMessageListener implements MessageListener {

    @Override
    public void onMessage(Message message) {
        String strMessage = new String(message.getBody(), Charset.forName("UTF-8"));
        log.info("string message = {}", strMessage);
        
        Gson gson = new Gson();
        SimpleMessage msg = gson.fromJson(strMessage, SimpleMessage.class);
        log.info("obj tostring : {}", msg);

    }

}