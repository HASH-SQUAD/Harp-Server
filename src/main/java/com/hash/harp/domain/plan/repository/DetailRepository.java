package com.hash.harp.domain.plan.repository;

import com.hash.harp.domain.plan.domain.Detail;
import com.hash.harp.domain.plan.exception.DetailNotFoundException;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetailRepository extends JpaRepository<Detail, Long> {
    default Detail getById(Long id) {
        return findById(id)
                .orElseThrow(() -> new DetailNotFoundException(id));
    }
}
