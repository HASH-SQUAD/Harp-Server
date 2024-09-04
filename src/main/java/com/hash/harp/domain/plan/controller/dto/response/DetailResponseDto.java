package com.hash.harp.domain.plan.controller.dto.response;

import com.hash.harp.domain.plan.domain.Detail;

public record DetailResponseDto(
        Long id,
        String content
) {
    public static DetailResponseDto from(final Detail detail) {
        return new DetailResponseDto(
                detail.getId(),
                detail.getContent()
        );
    }
}
