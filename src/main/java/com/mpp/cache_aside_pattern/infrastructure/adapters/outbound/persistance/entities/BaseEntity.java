package com.mpp.cache_aside_pattern.infrastructure.adapters.outbound.persistance.entities;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
public abstract class BaseEntity implements Serializable {

    @Column(name = "dh_register")
    private Date dhRegister;

    @Column(name = "dh_update")
    private Date dhUpdate;
}