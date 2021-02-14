package com.crud.library.domain.com.crud.library.domain.Dto;

public class WydawnictwaDto {

    private Integer idWydawnictwo;
    private String nazwa;

    public WydawnictwaDto(Integer idWydawnictwo, String nazwa) {
        this.idWydawnictwo = idWydawnictwo;
        this.nazwa = nazwa;
    }

    public Integer getIdWydawnictwo() {
        return idWydawnictwo;
    }

    public void setIdWydawnictwo(Integer idWydawnictwo) {
        this.idWydawnictwo = idWydawnictwo;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
}
