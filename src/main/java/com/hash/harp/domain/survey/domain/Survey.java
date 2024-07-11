package com.hash.harp.domain.survey.domain;

import com.hash.harp.domain.survey.domain.type.Food;
import com.hash.harp.domain.survey.domain.type.Mbti;
import com.hash.harp.domain.survey.domain.type.Travel;
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

    @Builder
    public Survey(Travel travel, Food food, Mbti mbti, String content) {
        this.travel = travel;
        this.food = food;
        this.mbti = mbti;
        this.content = content;
    }
}
