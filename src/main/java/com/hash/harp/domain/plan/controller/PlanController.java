package com.hash.harp.domain.plan.controller;

import com.hash.harp.domain.plan.controller.dto.request.HeaderRequestDto;
import com.hash.harp.domain.plan.controller.dto.request.PlanRequestDto;
import com.hash.harp.domain.plan.service.CommandPlanService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/plan")
public class PlanController {

    private final CommandPlanService commandPlanService;

    @PostMapping("/header")
    private void createHeader(@RequestBody HeaderRequestDto headerRequestDto) {
        commandPlanService.createPlanHeader(headerRequestDto);
    }

    @PostMapping("/day")
    private void createPlan(@RequestBody PlanRequestDto planRequestDto) {
        commandPlanService.creatPlan(planRequestDto);
    }

    ) {
        commandPlanService.updatePlan(planRequestDto, headerId);
    }

    @DeleteMapping("/day/{headerId}")
    private void deletePlan(@PathVariable(name = "headerId") Long headerId) {
        commandPlanService.deletePlan(headerId);
    }

    }
}
