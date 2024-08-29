package com.hash.harp.domain.user.controller.dto;

import com.hash.harp.domain.user.domain.User;
import com.hash.harp.domain.user.domain.type.Gender;

public record UserResponseDto(
        Long id,
        String birthday,
        String nickname,
        Gender gender
) {
    public static UserResponseDto from(final User user) {
        return new UserResponseDto(user.getId(), user.getBirthday(), user.getNickname(), user.getGender());
    }
}
