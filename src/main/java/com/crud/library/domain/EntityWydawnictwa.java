package com.crud.library.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Wydawnictwa")
public class EntityWydawnictwa {

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_wydawnictwo")
    private Integer idWydawnictwo;

    @NotNull
    @Column(name = "nazwa")
    private String nazwa;

    @OneToMany(
            targetEntity = EntityKsiazki.class,
            mappedBy = "idWydawnictwo",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    private List<EntityKsiazki> listaKsiazek = new ArrayList<>();

    public EntityWydawnictwa() {
    }

    public EntityWydawnictwa(Integer idWydawnictwo, String nazwa) {
        this.idWydawnictwo = idWydawnictwo;
        this.nazwa = nazwa;
    }

    public List<EntityKsiazki> getListaKsiazek() {
        return listaKsiazek;
    }

    public void setListaKsiazek(List<EntityKsiazki> listaKsiazek) {
        this.listaKsiazek = listaKsiazek;
    }

    public EntityWydawnictwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public Integer getIdWydawnictwo() {
        return idWydawnictwo;
    }

    public void setIdWydawnictwo(Integer id_wydawnictwo) {
        this.idWydawnictwo = id_wydawnictwo;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
}
