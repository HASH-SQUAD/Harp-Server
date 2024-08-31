package com.hash.harp.domain.survey.controller;

import com.hash.harp.domain.survey.controller.dto.SurveyRequestDto;
import com.hash.harp.domain.survey.controller.dto.SurveyResponseDto;
import com.hash.harp.domain.survey.service.CommandSurveyService;
import com.hash.harp.domain.survey.service.QuerySurveyService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/survey")
public class SurveyController {

    private final CommandSurveyService commandSurveyService;
    private final QuerySurveyService querySurveyService;

    @PostMapping
    public void createSurvey(@RequestBody SurveyRequestDto surveyRequestDto) {
        commandSurveyService.createSurvey(surveyRequestDto);
    }

    @GetMapping("/{surveyId}")
    public SurveyResponseDto readById(@PathVariable("surveyId") Long id) {
        return SurveyResponseDto.from(querySurveyService.readById(id));
    }
}
