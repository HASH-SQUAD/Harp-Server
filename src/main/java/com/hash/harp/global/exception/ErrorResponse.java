package com.hash.harp.global.exception;

public record ErrorResponse(
        int status,
        String message,
        String code

) {
    @Override
    public String toString() {
        return "{\n" +
                "\t\"status\": " + status +
                ",\n\t\"code\": \"" + code + '\"' +
                ",\n\t\"message\": \"" + message + '\"' +
                "\n}";
    }
}