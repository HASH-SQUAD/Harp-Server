package com.hash.harp.domain.plan.controller.dto.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.time.LocalTime;
import java.util.List;
import java.util.Map;

@Getter
@RequiredArgsConstructor
public class PlanRequestDto {
    private final Long userId;
    private final String title;
    private Map<String, List<ActivityDto>> dayMap;

    @Getter
    @NoArgsConstructor
    public static class ActivityDto {
        private Long userId;
        private String time;
        private String activity;
        private String storeName;
        private String location;
        private String placeUrl;
    }
}