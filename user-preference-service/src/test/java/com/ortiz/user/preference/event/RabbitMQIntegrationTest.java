package com.ortiz.user.preference.event;

import com.ortiz.user.preference.event.message.UserCreatedMessage;
import com.ortiz.user.preference.service.UserPreferenceService;
import org.junit.jupiter.api.Test;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.verify;

@SpringBootTest
public class RabbitMQIntegrationTest {

    @Autowired
    RabbitTemplate rabbitTemplate;

    @Autowired
    Queue queue;

    @MockBean
    UserPreferenceService userPreferenceService;

    @Test
    public void testMessageConsumption() throws Exception {
        rabbitTemplate.convertAndSend(queue.getName(), new UserCreatedMessage("userId", "userName"));

        Thread.sleep(2000L);

        verify(userPreferenceService).process(any(UserCreatedMessage.class));
    }
}
