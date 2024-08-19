package com.hash.harp.domain.plan.service.command;

import com.hash.harp.domain.plan.domain.Header;
import com.hash.harp.domain.plan.controller.dto.request.HeaderRequestDto;
import com.hash.harp.domain.plan.repository.PlanRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CommandHeaderService {

    private final PlanRepository planRepository;

    public void createPlanHeader(HeaderRequestDto HeaderRequestDto) {
        Header header = Header.builder()
                .title(HeaderRequestDto.title())
                .d_day(HeaderRequestDto.d_day())
                .startDay(HeaderRequestDto.startDate())
                .endDay(HeaderRequestDto.endDate())
                .duration(HeaderRequestDto.duration())
                .build();

        planRepository.save(header);
    }
}
