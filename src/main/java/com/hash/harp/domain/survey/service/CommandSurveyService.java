package com.hash.harp.domain.survey.service;

import com.hash.harp.domain.survey.controller.dto.SurveyRequestDto;
import com.hash.harp.domain.survey.domain.Survey;
import com.hash.harp.domain.survey.repository.SurveyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CommandSurveyService {

    private final SurveyRepository surveyRepository;

    public void createSurvey(SurveyRequestDto surveyRequestDto) {
        Survey survey = Survey.builder()
                .travel(surveyRequestDto.travel())
                .food(surveyRequestDto.food())
                .mbti(surveyRequestDto.mbti())
                .content(surveyRequestDto.content())
                .build();

        surveyRepository.save(survey);
    }
}
