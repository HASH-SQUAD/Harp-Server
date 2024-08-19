package com.hash.harp.domain.plan.repository;

import com.hash.harp.domain.plan.domain.Header;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanRepository extends JpaRepository<Header, Long> {
}
