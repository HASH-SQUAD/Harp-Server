package com.hash.harp.domain.user.service;

import com.hash.harp.domain.user.controller.dto.UserRequestDto;
import com.hash.harp.domain.user.domain.User;
import com.hash.harp.domain.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class CommandUserService {
    private final UserRepository userRepository;

    @Transactional
    public void update(UserRequestDto userRequestDto, Long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("사용자를 찾을 수 없습니다."));
        user.updateUserInfo(userRequestDto);
    }
}
