package com.mpp.cache_aside_pattern.application.services;

import com.mpp.cache_aside_pattern.business.PersonBo;
import com.mpp.cache_aside_pattern.infrastructure.adapters.inbound.exceptions.AlreadyExistsException;
import com.mpp.cache_aside_pattern.infrastructure.adapters.inbound.mappers.PersonMapper;
import com.mpp.cache_aside_pattern.infrastructure.adapters.inbound.web.dto.PersonDto;
import com.mpp.cache_aside_pattern.infrastructure.adapters.outbound.persistance.entities.PersonEntity;
import com.mpp.cache_aside_pattern.infrastructure.adapters.outbound.persistance.repositories.PersonRepositoryAdapter;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("personSaveService")
public class PersonPersistanceService {

    private final PersonRepositoryAdapter personRepositoryAdapter;

    public PersonPersistanceService(PersonRepositoryAdapter personRepositoryAdapter) {
        this.personRepositoryAdapter = personRepositoryAdapter;
    }

    public Page<PersonEntity> findAll(Pageable page) {
        return personRepositoryAdapter.findAll(page);
    }

    public PersonEntity findById(Long id) {
        return personRepositoryAdapter.findById(id).orElseThrow(() -> new EntityNotFoundException("Person was not found by id"));
    }

    @Transactional
    public PersonDto save(PersonDto dto) {
        PersonBo bo = PersonMapper.dtoToBo(dto);
        bo.validate();

        PersonEntity newPerson = PersonMapper.dtoToEntity(dto);
        List<PersonEntity> listOfAllPersons = personRepositoryAdapter.findAll();

        if (listOfAllPersons.stream()
                        .anyMatch(e -> e.getCpf().equals(newPerson.getCpf()))) {
            throw new AlreadyExistsException("It already exists a person with this CPF");
        }

        personRepositoryAdapter.save(newPerson);
        return dto;
    }
}
