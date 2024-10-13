package com.hash.harp.domain.user.exception;

import com.hash.harp.domain.survey.domain.Survey;
import com.hash.harp.global.exception.HarpException;
import org.springframework.http.HttpStatus;

public class UserNotFoundException extends HarpException {
  public UserNotFoundException(Long id) {
    super(HttpStatus.NOT_FOUND, id + "인 사용자를 찾을 수 없습니다.");
  }
}
