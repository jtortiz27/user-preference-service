package com.ortiz.user.preference.event.listener;

import com.ortiz.user.preference.event.message.UserCreatedMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class UserCreatedListener {

    @RabbitListener
    public void consume(@Payload UserCreatedMessage message) {
        log.info("received message: {}", message.toString());
    }
}
