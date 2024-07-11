package com.hash.harp.domain.survey.controller.dto;

import com.hash.harp.domain.survey.domain.type.Food;
import com.hash.harp.domain.survey.domain.type.Mbti;
import com.hash.harp.domain.survey.domain.type.Travel;

public record SurveyRequestDto(
        Food food,
        Mbti mbti,
        Travel travel,
        String content
) {
}
