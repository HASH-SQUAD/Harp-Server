package com.hash.harp.domain.plan.service.implementation;

import com.hash.harp.domain.plan.controller.dto.request.DetailRequestDto;
import com.hash.harp.domain.plan.domain.Detail;
import com.hash.harp.domain.plan.exception.DetailNotFoundException;
import com.hash.harp.domain.plan.repository.DetailRepository;
import com.hash.harp.domain.user.controller.dto.UserRequestDto;
import com.hash.harp.domain.user.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class PlanUpdater {
    private final DetailRepository detailRepository;

    @Transactional
    public void update(DetailRequestDto detailRequestDto, Long id) {
        Detail detail = detailRepository.findById(id)
                .orElseThrow(() -> new DetailNotFoundException(id));
        detail.updateDetail(detailRequestDto);
    }
}
