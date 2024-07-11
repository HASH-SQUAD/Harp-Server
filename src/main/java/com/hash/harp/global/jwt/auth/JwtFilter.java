package com.hash.harp.global.jwt.auth;

import com.hash.harp.global.jwt.util.JwtUtil;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@RequiredArgsConstructor
public class JwtFilter extends OncePerRequestFilter {

    private final JwtAuth jwtAuth;
    private final JwtUtil jwtUtil;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        String token = jwtUtil.resolveToken(request);

        SetAuthenticationInSecurityContext(token);
        filterChain.doFilter(request, response);
    }

    private void SetAuthenticationInSecurityContext(String token) {
        if (token != null) {
            Authentication authentication = jwtAuth.authentication(token);
            SecurityContextHolder.getContext().setAuthentication(authentication);
        }
    }
}
