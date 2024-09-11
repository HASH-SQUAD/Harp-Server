package com.hash.harp.domain.plan.controller.dto.response;

import com.hash.harp.domain.plan.domain.Plan;

import java.time.LocalTime;

public record PlanResponseDto(
        Long Id,
        Long userId,
        String day,
        LocalTime time,
        String activity,
        String location,
        String storeName,
        String placeUrl,
        String title
) {
    public static PlanResponseDto from(final Plan plan) {
        return new PlanResponseDto(
                plan.getUserId(),
                plan.getId(),
                plan.getDay(),
                plan.getTime(),
                plan.getActivity(),
                plan.getLocation(),
                plan.getStoreName(),
                plan.getPlaceUrl(),
                plan.getTitle()
        );
    }
}
