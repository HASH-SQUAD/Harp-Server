package com.hash.harp.domain.plan.repository;

import com.hash.harp.domain.plan.domain.Detail;
import com.hash.harp.domain.plan.domain.Plan;
import com.hash.harp.domain.plan.exception.PlanNotFoundException;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanRepository extends JpaRepository<Plan, Long> {
    default Plan getById(Long id) {
        return findById(id)
                .orElseThrow(() -> new PlanNotFoundException(id));
    }
}
