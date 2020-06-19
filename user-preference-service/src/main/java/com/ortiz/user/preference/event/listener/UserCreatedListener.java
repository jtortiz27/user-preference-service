package com.ortiz.user.preference.event.listener;

import com.ortiz.user.preference.event.message.UserCreatedMessage;
import com.ortiz.user.preference.service.UserPreferenceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class UserCreatedListener {

    @Autowired
    UserPreferenceService userPreferenceService;

    @RabbitListener(queues = "test-queue")
    public void consume(UserCreatedMessage message) {
        log.info("received message: {}", message.toString());

        userPreferenceService.process(message);
    }
}
