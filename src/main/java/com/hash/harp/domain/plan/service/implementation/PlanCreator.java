package com.hash.harp.domain.plan.service.implementation;

import com.hash.harp.domain.plan.controller.dto.request.DetailRequestDto;
import com.hash.harp.domain.plan.controller.dto.request.PlanRequestDto;
import com.hash.harp.domain.plan.domain.Detail;
import com.hash.harp.domain.plan.domain.Plan;
import com.hash.harp.domain.plan.repository.DetailRepository;
import com.hash.harp.domain.plan.repository.PlanRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PlanCreator {

    private final PlanRepository planRepository;

    private final DetailRepository detailRepository;

    public void createPlan(PlanRequestDto planRequestDto) {
        Plan plan = Plan.builder()
                .day(planRequestDto.day())
                .time(planRequestDto.time())
                .location(planRequestDto.location())
                .activity(planRequestDto.activity())
                .storeName(planRequestDto.storeName())
                .placeUrl(planRequestDto.placeUrl())
                .build();

        planRepository.save(plan);
    }

    public void createDetail(DetailRequestDto detailRequestDto) {
        Detail detail = Detail.builder()
                .content(detailRequestDto.content())
                .build();

        detailRepository.save(detail);
    }
}
