package com.hash.harp.domain.plan.controller.dto.request;

import java.time.LocalTime;

public record PlanRequestDto(
        String day,
        LocalTime time,
        String activity,
        String location,
        String storeName,
        String placeUrl
) {
}
