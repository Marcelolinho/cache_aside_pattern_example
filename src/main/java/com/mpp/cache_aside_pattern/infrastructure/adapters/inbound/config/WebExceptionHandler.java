package com.mpp.cache_aside_pattern.infrastructure.adapters.inbound.config;

import com.mpp.cache_aside_pattern.infrastructure.adapters.inbound.config.exceptions.ApiError;
import com.mpp.cache_aside_pattern.infrastructure.adapters.inbound.exceptions.InvalidCepException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDate;
import java.time.LocalDateTime;

@ControllerAdvice
public class WebExceptionHandler {

    @ExceptionHandler(IllegalArgumentException.class)
    public ApiError illegalArgumentExceptionHandler(IllegalArgumentException e) {
        return ApiError.builder()
                .message(e.getMessage())
                .timestamp(LocalDate.now())
                .status(HttpStatus.BAD_REQUEST.value())
                       .build();
    }

    @ExceptionHandler(InvalidCepException.class)
    public ApiError invalidCepExceptionHandler(InvalidCepException e) {
        return ApiError.builder()
                .message(e.getMessage())
                .timestamp(LocalDate.now())
                .status(HttpStatus.BAD_REQUEST.value())
                .build();
    }
}
