package com.hash.harp.domain.image.controller;

import com.hash.harp.domain.image.controller.dto.ImageResponseDto;
import com.hash.harp.domain.image.service.CommandImageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequiredArgsConstructor
@RequestMapping("/image")
public class ImageController {
    private final CommandImageService commandImageService;

    @PostMapping("/Header")
    @ResponseStatus(HttpStatus.CREATED)
    public ImageResponseDto uploadPlanImage(MultipartFile file) {
        return ImageResponseDto.from(
                commandImageService.uploadImage(file, "plan-images")
        );
    }

    @PostMapping("/profile")
    @ResponseStatus(HttpStatus.CREATED)
    public ImageResponseDto uploadProfileImage(MultipartFile file) {
        return ImageResponseDto.from(
                commandImageService.uploadImage(file, "profile-pictures")
        );
    }

}