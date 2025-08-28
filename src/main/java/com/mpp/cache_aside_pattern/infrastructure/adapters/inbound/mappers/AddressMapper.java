package com.mpp.cache_aside_pattern.infrastructure.adapters.inbound.mappers;

import com.mpp.cache_aside_pattern.business.AddressBo;
import com.mpp.cache_aside_pattern.infrastructure.adapters.outbound.cepValidation.dto.AddressDto;
import com.mpp.cache_aside_pattern.infrastructure.adapters.outbound.persistance.entities.AddressEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface AddressMapper {

    AddressDto boToDto(AddressBo bo);

    AddressBo dtoToBo(AddressDto dto);

    AddressEntity dtoToEntity(AddressDto dto);
}
