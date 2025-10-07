package com.mpp.cache_aside_pattern.infrastructure.adapters.outbound.persistance.repositories;

import com.mpp.cache_aside_pattern.infrastructure.adapters.outbound.persistance.entities.PersonEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepositoryAdapter extends JpaRepository<PersonEntity, Long> {
    Page<PersonEntity> findAll(Pageable page);
}
