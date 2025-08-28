package com.mpp.cache_aside_pattern.infrastructure.adapters.outbound.persistance.repositories;

import com.mpp.cache_aside_pattern.infrastructure.adapters.outbound.persistance.entities.AddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<AddressEntity, Long> {
}
