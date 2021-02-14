package com.crud.library.domain.com.crud.library.domain.Dto;

public class KategorieDto {

    private Integer idKategoria;
    private String nazwa;

    public KategorieDto(Integer idKategoria, String nazwa) {
        this.idKategoria = idKategoria;
        this.nazwa = nazwa;
    }

    public Integer getIdKategoria() {
        return idKategoria;
    }

    public void setIdKategoria(Integer idKategoria) {
        this.idKategoria = idKategoria;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
}
