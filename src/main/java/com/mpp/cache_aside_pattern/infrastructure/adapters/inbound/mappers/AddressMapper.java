package com.mpp.cache_aside_pattern.infrastructure.adapters.inbound.mappers;

import com.mpp.cache_aside_pattern.business.AddressBo;
import com.mpp.cache_aside_pattern.infrastructure.adapters.outbound.cepValidation.dto.AddressDto;
import com.mpp.cache_aside_pattern.infrastructure.adapters.outbound.persistance.entities.AddressEntity;

public class AddressMapper {

    public AddressMapper() {
    }

    public static AddressBo dtoToBo(AddressDto dto) {
        final AddressBo bo = new AddressBo();

        bo.setStreet(dto.getLogradouro());
        bo.setPostalCode(dto.getCep());
        bo.setNeighbourhood(dto.getBairro());
        bo.setState(dto.getEstado());
        bo.setCountry(dto.getPais());

        return bo;
    }

    public static AddressDto entityToDto(AddressEntity entity) {
        final AddressDto dto = new AddressDto();

        dto.setLogradouro(entity.getStreet());
        dto.setCep(entity.getPostalCode());
        dto.setBairro(entity.getNeighbourhood());
        dto.setEstado(entity.getState());
        dto.setPais(entity.getCountry());

        return dto;
    }

    public static AddressEntity dtoToEntity(AddressDto dto) {
        final AddressEntity entity = new AddressEntity();

        entity.setStreet(dto.getLogradouro());
        entity.setPostalCode(dto.getCep());
        entity.setNeighbourhood(dto.getBairro());
        entity.setState(dto.getEstado());
        entity.setCountry(dto.getPais());

        return entity;
    }

    public static AddressBo entityToBo(AddressEntity entity) {
        final AddressBo bo = new AddressBo();

        bo.setStreet(entity.getStreet());
        bo.setPostalCode(entity.getPostalCode());
        bo.setNeighbourhood(entity.getNeighbourhood());
        bo.setState(entity.getState());
        bo.setCountry(entity.getCountry());

        return bo;
    }
}
