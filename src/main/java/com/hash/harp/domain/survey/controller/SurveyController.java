package com.hash.harp.domain.survey.controller;

import com.hash.harp.domain.survey.controller.dto.SurveyRequestDto;
import com.hash.harp.domain.survey.controller.dto.SurveyResponseDto;
import com.hash.harp.domain.survey.service.CommandSurveyService;
import com.hash.harp.domain.survey.service.QuerySurveyService;
import com.hash.harp.global.jwt.service.JwtService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/survey")
public class SurveyController {

    private final CommandSurveyService commandSurveyService;

    private final QuerySurveyService querySurveyService;

    private final JwtService jwtService;

    @PostMapping
    public void createSurvey(HttpServletRequest request, @RequestBody SurveyRequestDto surveyRequestDto) {
        String token = request.getHeader("Authorization");
        Long userId = jwtService.getUserIdFromToken(token);

        commandSurveyService.createSurvey(surveyRequestDto, userId);
    }

    @GetMapping("/{surveyId}")
    public SurveyResponseDto readById(@PathVariable("surveyId") Long id) {
        return SurveyResponseDto.from(querySurveyService.readById(id));
    }
}
