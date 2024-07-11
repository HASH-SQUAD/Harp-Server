package com.hash.harp.global.feign.client;

import com.hash.harp.global.feign.dto.google.GoogleTokenRequest;
import com.hash.harp.global.feign.dto.google.GoogleTokenResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "googleAuthClient", url = "https://oauth2.googleapis.com/token")
public interface GoogleAuthClient {
    @PostMapping
    GoogleTokenResponse getGoogleToken(GoogleTokenRequest request);
}
