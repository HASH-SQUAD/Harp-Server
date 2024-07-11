package com.hash.harp.domain.survey.controller.dto;

import com.hash.harp.domain.survey.domain.Survey;
import com.hash.harp.domain.survey.domain.type.Food;
import com.hash.harp.domain.survey.domain.type.Mbti;
import com.hash.harp.domain.survey.domain.type.Travel;

public record SurveyResponseDto(
        Long id,
        Food food,
        Mbti mbti,
        Travel travel,
        String content
) {
    public static SurveyResponseDto from(final Survey survey) {
        return new SurveyResponseDto(survey.getId(), survey.getFood(), survey.getMbti(), survey.getTravel(), survey.getContent());
    }
}
