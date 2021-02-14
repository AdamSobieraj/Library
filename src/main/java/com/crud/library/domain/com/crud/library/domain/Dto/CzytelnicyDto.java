package com.crud.library.domain.com.crud.library.domain.Dto;

import java.sql.Date;

public class CzytelnicyDto {

    private Integer idCzytelnik;
    private String login;
    private String haslo;
    private String email;
    private Integer telefon;
    private Date dataUrodzenia;

    public CzytelnicyDto(Integer idCzytelnik, String login, String haslo, String email, Integer telefon, Date dataUrodzenia) {
        this.idCzytelnik = idCzytelnik;
        this.login = login;
        this.haslo = haslo;
        this.email = email;
        this.telefon = telefon;
        this.dataUrodzenia = dataUrodzenia;
    }

    public Integer getIdCzytelnik() {
        return idCzytelnik;
    }

    public void setIdCzytelnik(Integer idCzytelnik) {
        this.idCzytelnik = idCzytelnik;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getTelefon() {
        return telefon;
    }

    public void setTelefon(Integer telefon) {
        this.telefon = telefon;
    }

    public Date getDataUrodzenia() {
        return dataUrodzenia;
    }

    public void setDataUrodzenia(Date dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }
}
