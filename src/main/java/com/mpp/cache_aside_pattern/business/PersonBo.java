package com.mpp.cache_aside_pattern.business;

import com.mpp.cache_aside_pattern.business.enums.EnumCpfSituation;

public class PersonBo {

    private Long id;

    private String name;

    private String surname;

    private String cpf;

    private EnumCpfSituation cpfSituation;

    public void validate() {
        if (name.length() < 3 || surname.length() < 3) {
            throw new IllegalArgumentException("Name and surname must have at least 3 characters.");
        }
        if (cpf.isEmpty() || !cpf.matches("^\\d{12}$\n")) {
            throw new IllegalArgumentException("Cpf has the invalid number of numbers!");
        }
    }
}
