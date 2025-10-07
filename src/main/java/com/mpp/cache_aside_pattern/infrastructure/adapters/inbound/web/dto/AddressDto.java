package com.mpp.cache_aside_pattern.infrastructure.adapters.inbound.web.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class AddressDto {
    private String postalCode;
    private String street;
    private String city;
    private String state;
    private String country;
}
