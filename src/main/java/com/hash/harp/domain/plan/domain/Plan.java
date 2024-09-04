package com.hash.harp.domain.plan.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalTime;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Plan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String day;

    private LocalTime time;

    private String activity;

    private String location;

    private String storeName;

    private String placeUrl;


    @Builder
    public Plan(String day, LocalTime time, String activity, String location, String storeName, String placeUrl) {
        this.day = day;
        this.time = time;
        this.activity = activity;
        this.location = location;
        this.storeName = storeName;
        this.placeUrl = placeUrl;
    }

}
