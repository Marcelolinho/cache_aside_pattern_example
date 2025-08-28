package com.mpp.cache_aside_pattern.infrastructure.adapters.inbound.exceptions;

public class InvalidCepException extends RuntimeException {
    public InvalidCepException(String message) {
        super(message);
    }
}
