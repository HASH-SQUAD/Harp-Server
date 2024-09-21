package com.hash.harp.domain.plan.exception;

import com.hash.harp.global.exception.HarpException;
import org.springframework.http.HttpStatus;

public class HeaderNotFoundException extends HarpException {
    public HeaderNotFoundException(Long id) {
        super(HttpStatus.NOT_FOUND, "id가 " + id + "인 상세를 찾을 수 없습니다.");
    }
}