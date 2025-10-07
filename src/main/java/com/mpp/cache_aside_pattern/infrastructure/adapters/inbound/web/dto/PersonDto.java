package com.mpp.cache_aside_pattern.infrastructure.adapters.inbound.web.dto;

import com.mpp.cache_aside_pattern.infrastructure.adapters.outbound.cepValidation.dto.AddressDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonDto {
    private String name;
    private String surname;
    private String cpf;
    private AddressDto address;
}
