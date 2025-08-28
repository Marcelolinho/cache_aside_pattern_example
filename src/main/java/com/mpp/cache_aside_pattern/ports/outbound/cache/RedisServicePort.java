package com.mpp.cache_aside_pattern.ports.outbound.cache;

public interface RedisServicePort {

    void save(String key, String value, long ttl);

    String search(String key);
}
