package com.crud.library.domain.com.crud.library.domain.Dto;

public class PracownicyDto {

    private Integer idPracownik;
    private String login;
    private String haslo;

    public PracownicyDto(Integer idPracownik, String login, String haslo) {
        this.idPracownik = idPracownik;
        this.login = login;
        this.haslo = haslo;
    }

    public Integer getIdPracownik() {
        return idPracownik;
    }

    public void setIdPracownik(Integer idPracownik) {
        this.idPracownik = idPracownik;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getHaslo() {
        return haslo;
    }

    public void setHaslo(String haslo) {
        this.haslo = haslo;
    }

}
