package com.hash.harp.domain.image.exception;

import com.hash.harp.global.exception.HarpException;
import org.springframework.http.HttpStatus;

public class S3SaveException extends HarpException {
    public S3SaveException() {
        super(HttpStatus.INTERNAL_SERVER_ERROR, "사진을 저장하던 중 오류가 발생하였습니다.");
    }
}

