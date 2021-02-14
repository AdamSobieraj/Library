package com.crud.library.domain.com.crud.library.domain.Dto;

public class KsiazkiDto {

    private Integer idKsiazka;
    private String isbn;
    private Integer idKategoria;
    private String tytul;
    private String opis;
    private Integer idAutr;
    private Integer rokWydania;
    private String eanCode;

    public KsiazkiDto(Integer idKsiazka, String isbn, Integer idKategoria, String tytul, String opis, Integer idAutr, Integer rokWydania, String eanCode) {
        this.idKsiazka = idKsiazka;
        this.isbn = isbn;
        this.idKategoria = idKategoria;
        this.tytul = tytul;
        this.opis = opis;
        this.idAutr = idAutr;
        this.rokWydania = rokWydania;
        this.eanCode = eanCode;
    }

    public Integer getIdKsiazka() {
        return idKsiazka;
    }

    public void setIdKsiazka(Integer idKsiazka) {
        this.idKsiazka = idKsiazka;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Integer getIdKategoria() {
        return idKategoria;
    }

    public void setIdKategoria(Integer idKategoria) {
        this.idKategoria = idKategoria;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public Integer getIdAutr() {
        return idAutr;
    }

    public void setIdAutr(Integer idAutr) {
        this.idAutr = idAutr;
    }

    public Integer getRokWydania() {
        return rokWydania;
    }

    public void setRokWydania(Integer rokWydania) {
        this.rokWydania = rokWydania;
    }

    public String getEanCode() {
        return eanCode;
    }

    public void setEanCode(String eanCode) {
        this.eanCode = eanCode;
    }
}
