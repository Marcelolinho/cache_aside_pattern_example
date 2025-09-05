package com.mpp.cache_aside_pattern.business;

public class AddressBo {
    private Long id;

    private String postalCode;

    private String street;

    private String  neighbourhood;

    private String state;

    private String uf;

    public AddressBo() {
    }

    public AddressBo(Long id, String postalCode, String street, String neighbourhood, String state, String uf) {
        this.id = id;
        this.postalCode = postalCode;
        this.street = street;
        this.neighbourhood = neighbourhood;
        this.state = state;
        this.uf = uf;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNeighbourhood() {
        return neighbourhood;
    }

    public void setNeighbourhood(String neighbourhood) {
        this.neighbourhood = neighbourhood;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    @Override
    public String toString() {
        return "AddressBo{" +
                "id=" + id +
                ", postalCode='" + postalCode + '\'' +
                ", street='" + street + '\'' +
                ", neighbourhood='" + neighbourhood + '\'' +
                ", state='" + state + '\'' +
                ", uf='" + uf + '\'' +
                '}';
    }
}
