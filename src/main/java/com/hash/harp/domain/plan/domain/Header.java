package com.hash.harp.domain.plan.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Header {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String d_day;

    private String startDay;

    private String endDay;

    private String duration;

    @Builder
    public Header(String title, String d_day, String startDay, String endDay, String duration) {
        this.title = title;
        this.d_day = d_day;
        this.startDay = startDay;
        this.endDay = endDay;
        this.duration = duration;
    }
}
