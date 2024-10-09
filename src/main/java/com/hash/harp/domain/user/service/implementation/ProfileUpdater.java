package com.hash.harp.domain.user.service.implementation;

import com.hash.harp.domain.plan.exception.HeaderNotFoundException;
import com.hash.harp.domain.user.controller.dto.UserRequestDto;
import com.hash.harp.domain.user.domain.User;
import com.hash.harp.domain.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class ProfileUpdater {
    private final UserRepository userRepository;

    public void updateProfile(UserRequestDto userRequestDto, Long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new HeaderNotFoundException(id));
        user.updateProfile(userRequestDto);
    }
}
