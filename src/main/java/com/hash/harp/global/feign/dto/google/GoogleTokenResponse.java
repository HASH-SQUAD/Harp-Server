package com.hash.harp.global.feign.dto.google;

import com.fasterxml.jackson.annotation.JsonProperty;

public record GoogleTokenResponse(
        @JsonProperty("access_token")
        String accessToken
) {
}
