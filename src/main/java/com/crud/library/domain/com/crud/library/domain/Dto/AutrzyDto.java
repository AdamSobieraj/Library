package com.crud.library.domain.com.crud.library.domain.Dto;

public class AutrzyDto {

    private Integer idAutora;
    private String imie;
    private String nazwisko;

    public AutrzyDto(Integer idAutora, String imie, String nazwisko) {
        this.idAutora = idAutora;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public Integer getIdAutora() {
        return idAutora;
    }

    public void setIdAutora(Integer idAutora) {
        this.idAutora = idAutora;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
}
