package com.hash.harp.domain.plan.service.implementation;

import com.hash.harp.domain.plan.controller.dto.request.HeaderRequestDto;
import com.hash.harp.domain.plan.domain.Header;
import com.hash.harp.domain.plan.repository.HeaderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HeaderCreator {

    private final HeaderRepository headerRepository;

    public void createHeader(HeaderRequestDto headerRequestDto) {
        Header header = Header.builder()
                .userId(headerRequestDto.userId())
                .title(headerRequestDto.title())
                .d_day(headerRequestDto.d_day())
                .startDay(headerRequestDto.startDate())
                .endDay(headerRequestDto.endDate())
                .duration(headerRequestDto.duration())
                .build();

        headerRepository.save(header);
    }
}
