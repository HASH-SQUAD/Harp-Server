package com.hash.harp.domain.user.controller.dto;

import com.hash.harp.domain.user.domain.type.Gender;

public record UserRequestDto (
        String address,
        String birthday,
        String nickname,
        Gender gender
) {

}
