package com.hash.harp.domain.plan.controller.dto.response;

import com.hash.harp.domain.plan.domain.Header;

public record HeaderResponseDto(
        Long id,
        String title,
        String d_day,
        String startDate,
        String endDate,
        String duration
) {
    public static HeaderResponseDto from(final Header header) {
        return new HeaderResponseDto(
                header.getId(),
                header.getTitle(),
                header.getD_day(),
                header.getStartDay(),
                header.getEndDay(),
                header.getDuration()
        );
    }
}
