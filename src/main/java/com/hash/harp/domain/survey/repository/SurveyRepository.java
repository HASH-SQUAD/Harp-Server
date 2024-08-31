package com.hash.harp.domain.survey.repository;

import com.hash.harp.domain.survey.domain.Survey;
import com.hash.harp.domain.survey.exception.SurveyNotFoundException;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SurveyRepository extends JpaRepository<Survey, Long> {
    default Survey getById(Long id) {
        return findById(id)
                .orElseThrow(() -> new SurveyNotFoundException(id));
    }
}
