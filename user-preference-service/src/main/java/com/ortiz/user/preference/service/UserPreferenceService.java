package com.ortiz.user.preference.service;

import com.ortiz.user.preference.event.message.UserCreatedMessage;
import org.springframework.stereotype.Service;

@Service
public interface UserPreferenceService {

    void process(UserCreatedMessage message);
}
