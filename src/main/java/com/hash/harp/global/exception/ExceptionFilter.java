package com.hash.harp.global.exception;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.MediaType;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

public class ExceptionFilter extends OncePerRequestFilter {
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        try {
            filterChain.doFilter(request, response);
        } catch (HarpException e) {
            writeErrorResponse(response, e.getStatus().value(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            writeErrorResponse(response, HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Internal server error");
        }
    }

    private void writeErrorResponse(HttpServletResponse response, int status, String message) throws IOException {
        ErrorResponse errorResponse = new ErrorResponse(status, message, "ERROR");

        response.setStatus(status);
        response.setCharacterEncoding("UTF-8");
        response.setContentType(MediaType.APPLICATION_JSON_VALUE);
        response.getWriter().write(errorResponse.toString());
    }
}
