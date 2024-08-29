package com.hash.harp.domain.survey.domain;

import com.hash.harp.domain.survey.domain.type.Food;
import com.hash.harp.domain.survey.domain.type.Mbti;
import com.hash.harp.domain.survey.domain.type.Travel;
import com.hash.harp.domain.user.domain.User;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Survey {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = true, length = 200)
    private String content;

    @Enumerated(EnumType.STRING)
    private Travel travel;

    @Enumerated(EnumType.STRING)
    private Food food;

    @Enumerated(EnumType.STRING)
    private Mbti mbti;

    @Column(name = "USER_ID")
    private Long userId;

    @Builder
    public Survey(Travel travel, Food food, Mbti mbti, String content, Long userId) {
        this.travel = travel;
        this.food = food;
        this.mbti = mbti;
        this.content = content;
        this.userId = userId;
    }
}
