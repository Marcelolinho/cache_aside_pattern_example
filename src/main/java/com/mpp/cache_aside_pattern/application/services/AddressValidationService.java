package com.mpp.cache_aside_pattern.application.services;

import com.mpp.cache_aside_pattern.business.AddressBo;
import com.mpp.cache_aside_pattern.infrastructure.adapters.inbound.exceptions.InvalidCepException;
import com.mpp.cache_aside_pattern.infrastructure.adapters.inbound.mappers.AddressMapper;
import com.mpp.cache_aside_pattern.infrastructure.adapters.outbound.cepValidation.ViaCepValidationAdapter;
import com.mpp.cache_aside_pattern.infrastructure.adapters.outbound.cepValidation.dto.AddressDto;
import com.mpp.cache_aside_pattern.ports.outbound.client.ViaCepClientPort;
import feign.FeignException;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;

@Service("viaCepValidationService")
public class AddressValidationService implements ViaCepClientPort {

    private final ViaCepValidationAdapter viaCepValidationAdapter;

    public AddressValidationService(ViaCepValidationAdapter viaCepValidationAdapter) {
        this.viaCepValidationAdapter = viaCepValidationAdapter;
    }

    @Override
    public AddressBo validateCep(String cep) {
        try {
            AddressDto address = viaCepValidationAdapter.getAddressByCep(cep)
                                 .orElseThrow(() -> new InvalidCepException(String.format("The postal code is invalid, %s does not exists!", cep)));

            return AddressMapper.dtoToBo(address);
        } catch (FeignException.FeignClientException e) {
            throw new RuntimeException("Couldn't finish request: ", e.getCause());
        }
    }
}
