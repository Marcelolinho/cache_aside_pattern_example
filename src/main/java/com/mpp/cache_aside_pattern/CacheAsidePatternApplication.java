package com.mpp.cache_aside_pattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CacheAsidePatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(CacheAsidePatternApplication.class, args);
	}

}
