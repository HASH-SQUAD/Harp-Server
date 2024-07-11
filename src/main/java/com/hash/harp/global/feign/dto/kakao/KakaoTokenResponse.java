package com.hash.harp.global.feign.dto.kakao;

import com.fasterxml.jackson.annotation.JsonProperty;

public record KakaoTokenResponse(
        @JsonProperty("access_token")
        String accessToken
) {
}
