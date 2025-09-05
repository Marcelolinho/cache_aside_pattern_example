package com.mpp.cache_aside_pattern.business;

import com.mpp.cache_aside_pattern.business.enums.EnumCpfSituation;

public class PersonBo {

    private Long id;

    private String name;

    private String surname;

    private String cpf;

    private EnumCpfSituation cpfSituation;

    private AddressBo address;

    public PersonBo() {
    }

    public PersonBo(Long id, String name, String surname, String cpf, EnumCpfSituation cpfSituation, AddressBo address) {
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

    public EnumCpfSituation validateCpf(String cpf) {
        if ((cpf.replace(".", "")).length() == 12) {
            return EnumCpfSituation.VALID;
        }
        return EnumCpfSituation.INVALID;
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

    public EnumCpfSituation getCpfSituation() {
        return cpfSituation;
    }

    public void setCpfSituation(EnumCpfSituation cpfSituation) {
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
