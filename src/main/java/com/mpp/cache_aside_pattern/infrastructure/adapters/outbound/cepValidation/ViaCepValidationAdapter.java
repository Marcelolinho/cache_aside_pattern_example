package com.mpp.cache_aside_pattern.infrastructure.adapters.outbound.cepValidation;

import com.mpp.cache_aside_pattern.infrastructure.adapters.outbound.cepValidation.dto.AddressDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Optional;

@Component
@FeignClient(name = "viacep", url = "https://viacep.com.br/ws/")
public interface ViaCepValidationAdapter {

    @GetMapping("/{cep}/json")
    AddressDto getAddressByCep(String cep);
}
