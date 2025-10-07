package com.mpp.cache_aside_pattern.infrastructure.adapters.inbound.config.exceptions;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Data
@Builder
public class ApiError {
    public String message;

    public LocalDate timestamp;

    public Integer status;
}
