package com.crud.library.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Ksiazki")
public class EntityKsiazki {

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_ksiazka")
    private Integer idksiazka;

    @NotNull
    @Column(name = "isbn")
    private String isbn;

    @NotNull
    @Column(name = "id_kategoria")
    private Integer idKategoria;

    @NotNull
    @Column(name = "tytul")
    private String tytul;

    @NotNull
    @Column(name = "opis")
    private String opis;

    @NotNull
    @Column(name = "id_autr")
    private Integer id_autr;

    @ManyToOne
    @JoinColumn(name = "id_wydawnictwo")
    private EntityWydawnictwa idWydawnictwo;

    @NotNull
    @Column(name = "rok_wydania")
    private Integer rok_wydania;

    @NotNull
    @Column(name = "EANCode")
    private String eanCode;

    public EntityKsiazki() {
    }

    public EntityKsiazki(Integer idksiazka, String isbn, Integer idKategoria, String tytul, String opis, Integer id_autr, Integer rok_wydania, String eanCode) {
        this.idksiazka = idksiazka;
        this.isbn = isbn;
        this.idKategoria = idKategoria;
        this.tytul = tytul;
        this.opis = opis;
        this.id_autr = id_autr;
        this.rok_wydania = rok_wydania;
        this.eanCode = eanCode;
    }

    public EntityKsiazki(String isbn, Integer idKategoria, String tytul, String opis, Integer id_autr, Integer rok_wydania, String eanCode) {
        this.isbn = isbn;
        this.idKategoria = idKategoria;
        this.tytul = tytul;
        this.opis = opis;
        this.id_autr = id_autr;
        this.rok_wydania = rok_wydania;
        this.eanCode = eanCode;
    }


    public Integer getIdksiazka() {
        return idksiazka;
    }

    public void setIdksiazka(Integer id_ksiazka) {
        this.idksiazka = id_ksiazka;
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

    public void setIdKategoria(Integer id_kategoria) {
        this.idKategoria = id_kategoria;
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

    public Integer getId_autr() {
        return id_autr;
    }

    public void setId_autr(Integer id_autr) {
        this.id_autr = id_autr;
    }

    public EntityWydawnictwa getIdWydawnictwo() {
        return idWydawnictwo;
    }

    public void setIdWydawnictwo(EntityWydawnictwa idWydawnictwo) {
        this.idWydawnictwo = idWydawnictwo;
    }

    public Integer getRok_wydania() {
        return rok_wydania;
    }

    public void setRok_wydania(Integer rok_wydania) {
        this.rok_wydania = rok_wydania;
    }

    public String getEanCode() {
        return eanCode;
    }

    public void setEanCode(String eanCode) {
        this.eanCode = eanCode;
    }
}
