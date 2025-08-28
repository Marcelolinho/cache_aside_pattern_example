package com.mpp.cache_aside_pattern.infrastructure.adapters.outbound.persistance.repositories;

import com.mpp.cache_aside_pattern.infrastructure.adapters.outbound.persistance.entities.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<PersonEntity, Long> {
}
