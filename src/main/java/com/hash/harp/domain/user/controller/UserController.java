package com.hash.harp.domain.user.controller;

import com.hash.harp.domain.user.controller.dto.UserRequestDto;
import com.hash.harp.domain.user.service.CommandUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

    private final CommandUserService commandUserService;

    @PutMapping("/{id}")
    public void updateUserInfo(@PathVariable Long id, @RequestBody UserRequestDto userRequestDto) {
        commandUserService.update(userRequestDto, id);
    }
}
