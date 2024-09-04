package com.hash.harp.domain.plan.domain;

import com.hash.harp.domain.plan.controller.dto.request.DetailRequestDto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Detail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;

    @Builder
    public Detail(String content) {
        this.content = content;
    }

    public void updateDetail(DetailRequestDto detailRequestDto) {
        this.content = detailRequestDto.content();
    }
}
