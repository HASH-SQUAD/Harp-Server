package com.hash.harp.domain.plan.controller;

import com.hash.harp.domain.plan.controller.dto.request.DetailRequestDto;
import com.hash.harp.domain.plan.controller.dto.request.HeaderRequestDto;
import com.hash.harp.domain.plan.controller.dto.request.PlanRequestDto;
import com.hash.harp.domain.plan.domain.Detail;
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

    @PostMapping("/detail")
    private void createContent(@RequestBody DetailRequestDto detailRequestDto) {
        commandPlanService.createDetail(detailRequestDto);
    }

    @PutMapping("/detail/{id}")
    private void updateDetail(
            @PathVariable Long id,
            @RequestBody DetailRequestDto detailReqduestDto
    ) {
        commandPlanService.updateDetail(detailReqduestDto, id);
    }

    @PutMapping("/day/{userId}/{title}")
    private void updatePlan(
            @PathVariable(name = "userId") Long userId,
            @RequestBody PlanRequestDto planRequestDto,
            @PathVariable(name = "title") String title
            ) {
        commandPlanService.updatePlan(planRequestDto, userId, title);
    }

    @DeleteMapping("/day/{userId}/{title}")
    private void deletePlan(
            @PathVariable(name = "userId") Long userId,
            @PathVariable(name = "title") String title
    )
    {
        commandPlanService.deletePlan(userId, title);
    }
}
