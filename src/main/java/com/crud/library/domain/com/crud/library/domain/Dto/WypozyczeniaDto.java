package com.crud.library.domain.com.crud.library.domain.Dto;

import java.sql.Date;

public class WypozyczeniaDto {

    private Integer idWypozyczenie;
    private Integer idKsiazka;
    private Date dataWypozyczenia;
    private Integer idRacownikWypozyczenie;
    private Date dataOddania;
    private Integer idPracownikOddanie;

    public WypozyczeniaDto(Integer idWypozyczenie, Integer idKsiazka, Date dataWypozyczenia, Integer idRacownikWypozyczenie, Date dataOddania, Integer idPracownikOddanie) {
        this.idWypozyczenie = idWypozyczenie;
        this.idKsiazka = idKsiazka;
        this.dataWypozyczenia = dataWypozyczenia;
        this.idRacownikWypozyczenie = idRacownikWypozyczenie;
        this.dataOddania = dataOddania;
        this.idPracownikOddanie = idPracownikOddanie;
    }

    public Integer getIdWypozyczenie() {
        return idWypozyczenie;
    }

    public void setIdWypozyczenie(Integer idWypozyczenie) {
        this.idWypozyczenie = idWypozyczenie;
    }

    public Integer getIdKsiazka() {
        return idKsiazka;
    }

    public void setIdKsiazka(Integer idKsiazka) {
        this.idKsiazka = idKsiazka;
    }

    public Date getDataWypozyczenia() {
        return dataWypozyczenia;
    }

    public void setDataWypozyczenia(Date dataWypozyczenia) {
        this.dataWypozyczenia = dataWypozyczenia;
    }

    public Integer getIdRacownikWypozyczenie() {
        return idRacownikWypozyczenie;
    }

    public void setIdRacownikWypozyczenie(Integer idRacownikWypozyczenie) {
        this.idRacownikWypozyczenie = idRacownikWypozyczenie;
    }

    public Date getDataOddania() {
        return dataOddania;
    }

    public void setDataOddania(Date dataOddania) {
        this.dataOddania = dataOddania;
    }

    public Integer getIdPracownikOddanie() {
        return idPracownikOddanie;
    }

    public void setIdPracownikOddanie(Integer idPracownikOddanie) {
        this.idPracownikOddanie = idPracownikOddanie;
    }
}
