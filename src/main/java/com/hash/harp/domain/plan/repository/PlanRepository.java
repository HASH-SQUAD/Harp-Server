package com.hash.harp.domain.plan.repository;

import com.hash.harp.domain.plan.domain.Plan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanRepository extends JpaRepository<Plan, Long> {
}
