package com.hash.harp.global.config.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties("oauth2.client.registration.kakao")
public class KakaoAuthProperties {
    private String clientId;
    private String clientSecret;
    private String redirectUri;
}
