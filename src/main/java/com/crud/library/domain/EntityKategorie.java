package com.crud.library.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "kategorie")
public class EntityKategorie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    @Column(name = "id_kategoria")
    private Integer idkategoria;

    @NotNull
    @Column(name = "nazwa")
    private String nazwa;

    public EntityKategorie() {
    }

    public EntityKategorie(Integer idkategoria, String nazwa) {
        this.idkategoria = idkategoria;
        this.nazwa = nazwa;
    }

    public EntityKategorie(String nazwa) {
        this.nazwa = nazwa;
    }

    public Integer getIdkategoria() {
        return idkategoria;
    }

    public void setIdkategoria(Integer id_kategoria) {
        this.idkategoria = id_kategoria;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
}
