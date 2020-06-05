package com.ortiz.user.preference.api.controller;

import com.ortiz.user.preference.api.model.UserPreferenceResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController(value = "/users")
public class UserPreferenceController {

    @GetMapping("/{userId}/userPreferences")
    public Mono<UserPreferenceResource> getPreferencesByUserId(@PathVariable("userId") String userId) {
        return Mono.just(new UserPreferenceResource());
    }
}
