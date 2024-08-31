package com.hash.harp.domain.survey.exception;

import com.hash.harp.domain.survey.domain.Survey;
import com.hash.harp.global.exception.HarpException;
import org.springframework.http.HttpStatus;

public class SurveyNotFoundException extends HarpException {
    public SurveyNotFoundException(Long id) {
        super(HttpStatus.NOT_FOUND, id + "인 아이디의 정보가 없습니다.");
    }
}
