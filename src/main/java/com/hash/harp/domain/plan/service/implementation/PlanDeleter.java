package com.hash.harp.domain.plan.service.implementation;

import com.hash.harp.domain.plan.domain.Plan;
import com.hash.harp.domain.plan.repository.PlanRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlanDeleter {

    private final PlanRepository planRepository;

    public void deletePlan(Long userId, String title) {
        List<Plan> plans = planRepository.findByUserIdAndTitle(userId, title);
        plans.forEach(plan -> planRepository.delete(plan));
    }

}
