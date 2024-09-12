package com.hash.harp.domain.plan.exception;

import com.hash.harp.global.exception.HarpException;
import org.springframework.http.HttpStatus;

public class PlanNotFoundException extends HarpException {
    public PlanNotFoundException(Long headerId) {
        super(HttpStatus.NOT_FOUND, "HeaderId가 " + headerId + "인 일정을 찾을 수 없습니다.");
    }
}
