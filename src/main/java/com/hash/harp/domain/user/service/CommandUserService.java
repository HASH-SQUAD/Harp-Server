package com.hash.harp.domain.user.service;

import com.hash.harp.domain.plan.controller.dto.request.HeaderRequestDto;
import com.hash.harp.domain.plan.domain.Header;
import com.hash.harp.domain.plan.exception.HeaderNotFoundException;
import com.hash.harp.domain.user.controller.dto.UserRequestDto;
import com.hash.harp.domain.user.domain.User;
import com.hash.harp.domain.user.repository.UserRepository;
import com.hash.harp.domain.user.service.implementation.ProfileUpdater;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class CommandUserService {
    private final UserRepository userRepository;

    private final ProfileUpdater profileUpdater;

    public void update(UserRequestDto userRequestDto, Long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("사용자를 찾을 수 없습니다."));
        user.updateUserInfo(userRequestDto);
    }

    public void updateProfile(UserRequestDto userRequestDto, Long id) {
        profileUpdater.updateProfile(userRequestDto, id);
    }
}
