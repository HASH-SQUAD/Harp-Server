package com.hash.harp.domain.plan.repository;

import com.hash.harp.domain.plan.domain.Header;
import com.hash.harp.domain.plan.domain.Plan;
import com.hash.harp.domain.plan.exception.HeaderNotFoundException;
import com.hash.harp.domain.plan.exception.PlanNotFoundException;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface PlanRepository extends JpaRepository<Plan, Long> {

    List<Plan> findByHeaderId(Long headerId);

}
