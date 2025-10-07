package com.mpp.cache_aside_pattern.infrastructure.adapters.outbound.cepValidation.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddressDto {
    private String cep;

    private String logradouro;

    private String bairro;

    private String estado;

    private String pais;
}
