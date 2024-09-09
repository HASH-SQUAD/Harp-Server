package com.hash.harp.domain.plan.domain;

import com.hash.harp.domain.plan.controller.dto.request.DetailRequestDto;
import com.hash.harp.domain.plan.controller.dto.request.PlanRequestDto;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalTime;
import java.util.List;
import java.util.Map;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Plan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String day;

    @Column(name = "time", columnDefinition = "TIME")
    private LocalTime time;

    private String activity;

    private String location;

    private String storeName;

    private String placeUrl;

    private String title;

    private String userId;

    @Builder
    public Plan(String day, LocalTime time, String activity, String location, String storeName, String placeUrl, String userId, String title) { // title 필드 추가
        this.day = day;
        this.time = time;
        this.activity = activity;
        this.location = location;
        this.storeName = storeName;
        this.placeUrl = placeUrl;
        this.userId = userId;
        this.title = title;
    }

    public void updatePlan(PlanRequestDto planRequestDto) {
        this.title = planRequestDto.getTitle();
        this.activity = planRequestDto.getDayMap().get(this.day).get(0).getActivity();
        this.time = LocalTime.parse(planRequestDto.getDayMap().get(this.day).get(0).getTime());
    }
}
