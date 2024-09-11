package com.hash.harp.domain.plan.service.implementation;

import com.hash.harp.domain.plan.controller.dto.request.DetailRequestDto;
import com.hash.harp.domain.plan.controller.dto.request.PlanRequestDto;
import com.hash.harp.domain.plan.domain.Detail;
import com.hash.harp.domain.plan.domain.Plan;
import com.hash.harp.domain.plan.exception.DetailNotFoundException;
import com.hash.harp.domain.plan.exception.PlanNotFoundException;
import com.hash.harp.domain.plan.repository.DetailRepository;
import com.hash.harp.domain.plan.repository.PlanRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class PlanUpdater {
    private final DetailRepository detailRepository;

    private final PlanRepository planRepository;

    public void updateDetail(DetailRequestDto detailRequestDto, Long id) {
        Detail detail = detailRepository.findById(id)
                .orElseThrow(() -> new DetailNotFoundException(id));
        detail.updateDetail(detailRequestDto);
    }

    public void updatePlan(
            PlanRequestDto planRequestDto, Long userId, String title
    ) {
        List<Plan> plans = planRepository.findByUserIdAndTitle(userId, title);
        plans.forEach(plan -> plan.updatePlan(planRequestDto));
    }
}
