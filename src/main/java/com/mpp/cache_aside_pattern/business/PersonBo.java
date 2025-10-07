package com.mpp.cache_aside_pattern.business;

import com.mpp.cache_aside_pattern.business.enums.CpfSituationEnum;

public class PersonBo {

    private Long id;

    private String name;

    private String surname;

    private String cpf;

    private CpfSituationEnum cpfSituation;

    private AddressBo address;

    public PersonBo() {
    }

    public PersonBo(Long id, String name, String surname, String cpf, CpfSituationEnum cpfSituation, AddressBo address) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.cpf = cpf;
        this.cpfSituation = cpfSituation;
        this.address = address;
    }

    public void validate() {
        if (name.length() < 3 || surname.length() < 3) {
            throw new IllegalArgumentException("Name and surname must have at least 3 characters.");
        }
        if (cpf.isEmpty() || cpf.length() < 12) {
            throw new IllegalArgumentException("Cpf has the invalid number of numbers!");
        }
    }

    public CpfSituationEnum validateCpf(String cpf) {
        if ((cpf.replace(".", "")).length() == 12) {
            return CpfSituationEnum.VALID;
        }
        return CpfSituationEnum.INVALID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public CpfSituationEnum getCpfSituation() {
        return cpfSituation;
    }

    public void setCpfSituation(CpfSituationEnum cpfSituation) {
        this.cpfSituation = cpfSituation;
    }

    public AddressBo getAddress() {
        return address;
    }

    public void setAddress(AddressBo address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "PersonBo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", cpf='" + cpf + '\'' +
                ", cpfSituation=" + cpfSituation +
                '}';
    }
}
