package com.hash.harp.domain.survey.service;

import com.hash.harp.domain.survey.domain.Survey;
import com.hash.harp.domain.survey.repository.SurveyRepository;
import com.hash.harp.domain.survey.service.implementation.SurveyReader;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class QuerySurveyService {

    private final SurveyReader surveyReader;

    public Survey readById(Long id) {
        return surveyReader.readOne(id);
    }
}
