package com.hash.harp.domain.plan.controller.dto.request;

public record HeaderRequestDto(
        Long userId,
        String title,
        String d_day,
        String startDate,
        String endDate,
        String duration,
        String imgUrl,
        String url
) {
}
