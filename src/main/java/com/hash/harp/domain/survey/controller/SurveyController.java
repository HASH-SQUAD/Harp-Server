package com.hash.harp.domain.survey.controller;

import com.hash.harp.domain.survey.controller.dto.SurveyRequestDto;
import com.hash.harp.domain.survey.service.CommandSurveyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/survey")
public class SurveyController {

    private final CommandSurveyService commandSurveyService;

    @PostMapping
    public void createSurvey(@RequestBody SurveyRequestDto surveyRequestDto) {
        commandSurveyService.createSurvey(surveyRequestDto);
    }
}
