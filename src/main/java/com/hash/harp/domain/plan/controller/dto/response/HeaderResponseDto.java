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
    public static HeaderResponseDto from(final Header planHeader) {
        return new HeaderResponseDto(planHeader.getId(), planHeader.getTitle(), planHeader.getD_day(), planHeader.getStartDay(), planHeader.getEndDay(), planHeader.getDuration());
    }
}
