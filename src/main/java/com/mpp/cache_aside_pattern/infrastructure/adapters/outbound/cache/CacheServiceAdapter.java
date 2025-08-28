package com.mpp.cache_aside_pattern.infrastructure.adapters.outbound.cache;

import com.mpp.cache_aside_pattern.ports.outbound.cache.RedisServicePort;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class CacheServiceAdapter implements RedisServicePort {

    private StringRedisTemplate redisString;

    public CacheServiceAdapter(StringRedisTemplate templ) {
        this.redisString = templ;
    }

    @Override
    public void save(String key, String value, long ttl) {
        redisString
                .opsForValue()
                .set(key, value, ttl, TimeUnit.MINUTES);
    }

    @Override
    public String search(String key) {
        return redisString
                .opsForValue()
                .get(key);
    }
}
