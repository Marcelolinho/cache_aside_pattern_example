package com.mpp.cache_aside_pattern.infrastructure.adapters.inbound.mappers;

import com.mpp.cache_aside_pattern.business.PersonBo;
import com.mpp.cache_aside_pattern.infrastructure.adapters.inbound.web.dto.PersonDto;
import com.mpp.cache_aside_pattern.infrastructure.adapters.outbound.persistance.entities.PersonEntity;

public class PersonMapper {

    public PersonMapper() {
    }

    public static PersonBo dtoToBo(PersonDto dto) {
        final PersonBo bo = new PersonBo();

        bo.setName(dto.getName());
        bo.setSurname(dto.getSurname());
        bo.setCpf(dto.getCpf());
        bo.setCpfSituation(bo.validateCpf(dto.getCpf()));
        bo.setAddress(AddressMapper.dtoToBo(dto.getAddress()));

        return bo;
    }

    public static PersonEntity dtoToEntity(PersonDto dto) {
        final PersonEntity entity = new PersonEntity();

        entity.setName(entity.getName());
        entity.setSurname(entity.getSurname());
        entity.setCpf(entity.getCpf());
        entity.setAddress(AddressMapper.dtoToEntity(dto.getAddress()));

        return entity;
    }

    public static PersonDto entityToDto(PersonEntity entity) {
        final PersonDto dto = new PersonDto();

        dto.setName(entity.getName());
        dto.setSurname(entity.getSurname());
        dto.setCpf(entity.getCpf());
        dto.setCpf(entity.getCpf());
        dto.setAddress(AddressMapper.entityToDto(entity.getAddress()));

        return dto;
    }
}
