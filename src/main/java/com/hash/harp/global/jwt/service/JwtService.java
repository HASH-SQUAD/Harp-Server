package com.hash.harp.global.jwt.service;

import com.hash.harp.global.jwt.util.JwtUtil;
import io.jsonwebtoken.Claims;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JwtService {
    private final JwtUtil jwtUtil;

    public Long getUserIdFromToken(String token) {
        Claims claims = jwtUtil.getJwtBody(token);
        return claims.get("userId", Long.class);
    }
}