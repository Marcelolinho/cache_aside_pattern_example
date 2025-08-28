package com.mpp.cache_aside_pattern.infrastructure.adapters.inbound.config.exceptions;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class ApiError {
    public String message;

    public Date timestamp;

    public Integer status;

    public String error;
}
