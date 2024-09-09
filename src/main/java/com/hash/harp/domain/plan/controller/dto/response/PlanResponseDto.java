package com.hash.harp.domain.plan.controller.dto.response;

import com.hash.harp.domain.plan.domain.Plan;

import java.time.LocalTime;

public record PlanResponseDto(
        Long Id,
        String day,
        LocalTime time,
        String activity,
        String location,
        String storeName,
        String placeUrl,
        String title,
        String userId
) {
    public static PlanResponseDto from(final Plan plan) {
        return new PlanResponseDto(
                plan.getId(),
                plan.getDay(),
                plan.getTime(),
                plan.getActivity(),
                plan.getLocation(),
                plan.getStoreName(),
                plan.getPlaceUrl(),
                plan.getTitle(),
                plan.getUserId()
        );
    }
}
