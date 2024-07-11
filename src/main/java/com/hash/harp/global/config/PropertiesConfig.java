package com.hash.harp.global.config;


import com.hash.harp.global.config.properties.GoogleAuthProperties;
import com.hash.harp.global.config.properties.KakaoAuthProperties;
import com.hash.harp.global.jwt.properties.JwtProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties ({JwtProperties.class, GoogleAuthProperties.class, KakaoAuthProperties.class})
public class PropertiesConfig {
}
