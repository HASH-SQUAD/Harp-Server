package com.hash.harp.global.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public class HarpException extends RuntimeException {
    private final HttpStatus status;
    private final String message;
}
