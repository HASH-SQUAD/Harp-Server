package com.hash.harp.domain.survey.service.implementation;

import com.hash.harp.domain.survey.domain.Survey;
import com.hash.harp.domain.survey.exception.SurveyNotFoundException;
import com.hash.harp.domain.survey.repository.SurveyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SurveyReader {

    private final SurveyRepository surveyRepository;

    public Survey readOne(Long id) {
        return surveyRepository.findById(id)
                .orElseThrow(() ->  new SurveyNotFoundException(id));
    }
}
