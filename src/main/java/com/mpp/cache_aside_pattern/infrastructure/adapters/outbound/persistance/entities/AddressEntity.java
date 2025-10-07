package com.mpp.cache_aside_pattern.infrastructure.adapters.outbound.persistance.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "mpp_address")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AddressEntity extends BaseEntity {

    @Id
    @GeneratedValue(generator = "gen_id_address", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "gen_id_address", sequenceName = "gen_id_address", allocationSize = 1)
    private Long id;

    @Column(name = "postal_code", nullable = false)
    private String postalCode;

    @Column(name = "street", nullable = false)
    private String street;

    @Column(name = "city", nullable = false)
    private String city;

    @Column(name = "state", nullable = false)
    private String state;

    @Column(name = "neighbourhood")
    private String neighbourhood;

    @Column(name = "country", nullable = false)
    private String country;
}
