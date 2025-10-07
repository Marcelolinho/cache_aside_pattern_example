package com.mpp.cache_aside_pattern.infrastructure.adapters.inbound.exceptions;

public class AlreadyExistsException extends RuntimeException {
    public AlreadyExistsException(String message) {
        super(message);
    }
}
