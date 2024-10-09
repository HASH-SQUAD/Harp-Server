package com.hash.harp.domain.plan.service;

import com.hash.harp.domain.plan.controller.dto.request.HeaderRequestDto;
import com.hash.harp.domain.plan.controller.dto.request.PlanRequestDto;
import com.hash.harp.domain.plan.repository.HeaderRepository;
import com.hash.harp.domain.plan.repository.PlanRepository;
import com.hash.harp.domain.plan.service.implementation.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class CommandPlanService {

    private final PlanCreator planCreator;

    private final PlanUpdater planUpdater;

    private final PlanDeleter planDeleter;

    private final HeaderCreator headerCreator;

    private final HeaderUpdater headerUpdater;

    public void createHeader(HeaderRequestDto headerRequestDto) {
        headerCreator.createHeader(headerRequestDto);
    }

    public void creatPlan(PlanRequestDto planRequestDto) {
        planCreator.createPlan(planRequestDto);
    }

    public void updatePlan(
            PlanRequestDto planRequestDto, Long headerId
    ) {
        planUpdater.updatePlan(planRequestDto, headerId);
    }

    public void deletePlan(Long headerId) {
        planDeleter.deletePlan(headerId);
    }

    public void updateHeaderImg(HeaderRequestDto headerRequestDto, Long headerId) {
        headerUpdater.updateHeaderImg(headerRequestDto, headerId);
    }
}
