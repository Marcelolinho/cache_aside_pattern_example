package com.mpp.cache_aside_pattern.infrastructure.adapters.outbound.persistance.entities;

import com.mpp.cache_aside_pattern.business.enums.CpfSituationEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "mpp_person")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonEntity {

    @Id
    @SequenceGenerator(name = "person_sequence", sequenceName = "gen_id_person", allocationSize = 1)
    @GeneratedValue(generator = "gen_id_person", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "cpf")
    private String cpf;

    @Column(name = "cpf_situation")
    @Enumerated(EnumType.STRING)
    private CpfSituationEnum cpfSituation;

    @OneToOne
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private AddressEntity address;
}
