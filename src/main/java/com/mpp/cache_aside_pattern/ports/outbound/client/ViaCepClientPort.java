package com.mpp.cache_aside_pattern.ports.outbound.client;

import com.mpp.cache_aside_pattern.business.AddressBo;

public interface ViaCepClientPort {

    AddressBo validateCep(String cep);
}
