package com.hash.harp.domain.user.controller;

import com.hash.harp.domain.user.controller.dto.UserRequestDto;
import com.hash.harp.domain.user.service.CommandUserService;
import com.hash.harp.global.jwt.service.JwtService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

    private final CommandUserService commandUserService;

    private final JwtService jwtService;

    @PutMapping
    public void updateUserInfo(HttpServletRequest request, @RequestBody UserRequestDto userRequestDto) {
        String token = request.getHeader("Authorization");
        Long userId = jwtService.getUserIdFromToken(token);

        commandUserService.update(userRequestDto, userId);
    }

    @PutMapping("/profile")
    public void updateProfile(HttpServletRequest request,  @RequestBody UserRequestDto userRequestDto) {
        String token = request.getHeader("Authorization");
        Long userId = jwtService.getUserIdFromToken(token);

        commandUserService.updateProfile(userRequestDto, userId);
    }
}
