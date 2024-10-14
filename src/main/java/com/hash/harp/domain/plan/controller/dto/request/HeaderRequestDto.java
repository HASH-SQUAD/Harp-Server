package com.hash.harp.domain.plan.controller.dto.request;

public record HeaderRequestDto(
        String title,
        String d_day,
        String startDate,
        String endDate,
        String duration,
        String imgUrl
) {
}
