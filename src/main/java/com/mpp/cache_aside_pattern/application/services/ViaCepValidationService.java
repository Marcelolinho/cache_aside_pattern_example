package com.mpp.cache_aside_pattern.application.services;

import com.mpp.cache_aside_pattern.business.AddressBo;
import com.mpp.cache_aside_pattern.infrastructure.adapters.inbound.exceptions.InvalidCepException;
import com.mpp.cache_aside_pattern.infrastructure.adapters.inbound.mappers.AddressMapper;
import com.mpp.cache_aside_pattern.infrastructure.adapters.outbound.cepValidation.ViaCepValidationAdapter;
import com.mpp.cache_aside_pattern.infrastructure.adapters.outbound.cepValidation.dto.AddressDto;
import com.mpp.cache_aside_pattern.ports.outbound.client.ViaCepClientPort;
import feign.FeignException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service("viaCepValidationService")
public class ViaCepValidationService implements ViaCepClientPort {

    private final ViaCepValidationAdapter viaCepValidationAdapter;
    private final AddressMapper addressMapper;

    public ViaCepValidationService(ViaCepValidationAdapter viaCepValidationAdapter, AddressMapper addressMapper) {
        this.viaCepValidationAdapter = viaCepValidationAdapter;
        this.addressMapper = addressMapper;
    }

    @Override
    public AddressBo validateCep(String cep) {
        try {
            Optional<AddressDto> address = viaCepValidationAdapter.getAddressByCep(cep);

            if (address.isEmpty()) {
                throw new InvalidCepException(String.format("The postal code is invalid, %s does not exists!", cep));
            }

            AddressDto addressDto = viaCepValidationAdapter.getAddressByCep(cep).or;
        } catch (FeignException.FeignClientException e) {
            throw new RuntimeException("Couldn't finish request: ", e.getCause());
        }
    }
}
