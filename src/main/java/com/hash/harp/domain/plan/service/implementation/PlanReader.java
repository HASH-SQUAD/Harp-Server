package com.hash.harp.domain.plan.service.implementation;

import com.hash.harp.domain.plan.controller.dto.request.PlanRequestDto;
import com.hash.harp.domain.plan.controller.dto.response.PlanResponseDto;
import com.hash.harp.domain.plan.domain.Header;
import com.hash.harp.domain.plan.domain.Plan;
import com.hash.harp.domain.plan.exception.PlanNotFoundException;
import com.hash.harp.domain.plan.repository.HeaderRepository;
import com.hash.harp.domain.plan.repository.PlanRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlanReader {

    private final PlanRepository planRepository;

    public List<PlanResponseDto> readPlan(Long headerId) {
        List<Plan> plans = planRepository.findByHeaderId(headerId);

        return plans.stream()
                .map(PlanResponseDto::from)
                .toList();
    }

}
