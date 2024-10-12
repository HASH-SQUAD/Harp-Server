package com.hash.harp.domain.survey.service;

import com.hash.harp.domain.survey.controller.dto.SurveyRequestDto;
import com.hash.harp.domain.survey.domain.Survey;
import com.hash.harp.domain.survey.repository.SurveyRepository;
import com.hash.harp.domain.user.domain.User;
import com.hash.harp.domain.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CommandSurveyService {

    private final SurveyRepository surveyRepository;
    private final UserRepository userRepository;

    public void createSurvey(SurveyRequestDto surveyRequestDto) {
        Survey survey = Survey.builder()
                .userId(surveyRequestDto.userId())
                .travel(surveyRequestDto.travel())
                .food(surveyRequestDto.food())
                .mbti(surveyRequestDto.mbti())
                .content(surveyRequestDto.content())
                .build();

        surveyRepository.save(survey);

        User user = userRepository.findById(surveyRequestDto.userId())
                .orElseThrow(() -> new IllegalArgumentException("유저를 찾을 수 없습니다."));

        if (user.getIsFirst()) {
            user.update();
            userRepository.save(user);
        }
    }
}
