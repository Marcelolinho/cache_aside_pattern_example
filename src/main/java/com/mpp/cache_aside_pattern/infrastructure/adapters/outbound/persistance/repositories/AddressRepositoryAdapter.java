package com.mpp.cache_aside_pattern.infrastructure.adapters.outbound.persistance.repositories;

import com.mpp.cache_aside_pattern.infrastructure.adapters.outbound.persistance.entities.AddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepositoryAdapter extends JpaRepository<AddressEntity, Long> {
}
