package com.hash.harp.domain.plan.controller;

import com.hash.harp.domain.plan.controller.dto.request.HeaderRequestDto;
import com.hash.harp.domain.plan.service.command.CommandHeaderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/plan")
public class HeaderController {

    private final CommandHeaderService commandHeaderService;

    @PostMapping("/header")
    private void createHeader(@RequestBody HeaderRequestDto headerRequestDto) {
        commandHeaderService.createPlanHeader(headerRequestDto);
    }
}
