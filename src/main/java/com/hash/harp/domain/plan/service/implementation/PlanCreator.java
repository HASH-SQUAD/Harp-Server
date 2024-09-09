package com.hash.harp.domain.plan.service.implementation;

import com.hash.harp.domain.plan.controller.dto.request.DetailRequestDto;
import com.hash.harp.domain.plan.controller.dto.request.PlanRequestDto;
import com.hash.harp.domain.plan.domain.Detail;
import com.hash.harp.domain.plan.domain.Plan;
import com.hash.harp.domain.plan.repository.DetailRepository;
import com.hash.harp.domain.plan.repository.PlanRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class PlanCreator {

    private final PlanRepository planRepository;

    private final DetailRepository detailRepository;

    public void createPlan(PlanRequestDto planRequestDto) {
        String title = planRequestDto.getTitle();
        String userId = planRequestDto.getUserId();

        Map<String, List<PlanRequestDto.ActivityDto>> dayMap = planRequestDto.getDayMap();

        if (dayMap != null) {
            dayMap.forEach((day, activities) -> {
                activities.forEach(activityDto -> {
                    Plan plan = Plan.builder()
                            .day(day)
                            .time(LocalTime.parse(activityDto.getTime()))
                            .activity(activityDto.getActivity())
                            .location(activityDto.getLocation())
                            .storeName(activityDto.getStoreName())
                            .placeUrl(activityDto.getPlaceUrl())
                            .title(title)
                            .userId(userId)
                            .build();

                    planRepository.save(plan);

                    System.out.println(LocalTime.parse(activityDto.getTime()));
                });
            });
        }
    }

    public void createDetail(DetailRequestDto detailRequestDto) {
        Detail detail = Detail.builder()
                .content(detailRequestDto.content())
                .build();

        detailRepository.save(detail);
    }
}
