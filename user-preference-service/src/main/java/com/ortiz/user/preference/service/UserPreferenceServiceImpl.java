package com.ortiz.user.preference.service;

import com.ortiz.user.preference.event.message.UserCreatedMessage;
import org.springframework.stereotype.Service;

@Service
public class UserPreferenceServiceImpl implements UserPreferenceService {

    @Override
    public void process(UserCreatedMessage message) {

    }
}
