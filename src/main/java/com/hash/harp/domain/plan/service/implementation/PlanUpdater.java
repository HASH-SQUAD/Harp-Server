package com.hash.harp.domain.plan.service.implementation;

import com.hash.harp.domain.plan.controller.dto.request.PlanRequestDto;
import com.hash.harp.domain.plan.domain.Plan;
import com.hash.harp.domain.plan.repository.PlanRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class PlanUpdater {
    private final PlanRepository planRepository;

    public void updatePlan(
            PlanRequestDto planRequestDto, Long headerId
    ) {
        List<Plan> plans = planRepository.findByHeaderId(headerId);
        plans.forEach(plan -> plan.updatePlan(planRequestDto));
    }
}
