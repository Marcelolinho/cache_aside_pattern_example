package com.mpp.cache_aside_pattern.infrastructure.adapters.outbound.persistance.entities;


import com.mpp.cache_aside_pattern.business.enums.EnumCpfSituation;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "person")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonEntity {

    @Id
    @GeneratedValue(generator = "gen_person_id", strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "cpf")
    private String cpf;

    @Column(name = "cpf_situation")
    @Enumerated(EnumType.ORDINAL)
    private EnumCpfSituation cpfSituation;

    @ManyToMany
}
