package com.crud.library.domain.com.crud.library.domain.Dto;

public class RoleDto {

    private Integer idRola;
    private String nazwa;

    public RoleDto(Integer idRola, String nazwa) {
        this.idRola = idRola;
        this.nazwa = nazwa;
    }

    public Integer getIdRola() {
        return idRola;
    }

    public void setIdRola(Integer idRola) {
        this.idRola = idRola;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
}
