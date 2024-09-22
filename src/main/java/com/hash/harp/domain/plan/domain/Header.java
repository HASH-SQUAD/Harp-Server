package com.hash.harp.domain.plan.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Header {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "header_id")
    private Long id;

    @Column(name = "user_id")
    private Long userId;
    private String title;
    private String d_day;
    private String startDay;
    private String endDay;
    private String duration;
    private String imgUrl;
    private String url;



    @Builder
    public Header(String title, String d_day, String startDay, String endDay, String duration, Long userId, String imgUrl, String url) {
        this.title = title;
        this.d_day = d_day;
        this.startDay = startDay;
        this.endDay = endDay;
        this.duration = duration;
        this.userId = userId;
        this.imgUrl = imgUrl;
        this.url = url;
    }
}
