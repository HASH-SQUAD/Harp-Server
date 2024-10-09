package com.hash.harp.domain.plan.service.implementation;

import com.hash.harp.domain.plan.controller.dto.request.HeaderRequestDto;
import com.hash.harp.domain.plan.domain.Header;
import com.hash.harp.domain.plan.exception.HeaderNotFoundException;
import com.hash.harp.domain.plan.repository.HeaderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class HeaderUpdater {
    private final HeaderRepository headerRepository;

    public void updateHeaderImg(HeaderRequestDto headerRequestDto, Long headerId) {
        Header header = headerRepository.findById(headerId)
                .orElseThrow(() -> new HeaderNotFoundException(headerId));
        header.HeaderImgUpdate(headerRequestDto);
    }

}
