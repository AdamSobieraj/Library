package com.crud.library.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Role")
public class EntityRole {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    @Column(name = "id_rola")
    private Integer idrola;

    @NotNull
    @Column(name = "nazwa")
    private String nazwa;

    @OneToMany(
            targetEntity = EntityPracownicy.class,
            mappedBy = "idrola",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    private List<EntityPracownicy> listaPracownikow = new ArrayList<>();

    public EntityRole() {
    }

    public EntityRole(Integer idrola, String nazwa) {
        this.idrola = idrola;
        this.nazwa = nazwa;
    }

    public List<EntityPracownicy> getListaPracownikow() {
        return listaPracownikow;
    }

    public void setListaPracownikow(List<EntityPracownicy> listaPracownikow) {
        this.listaPracownikow = listaPracownikow;
    }

    public EntityRole(String nazwa) {
        this.nazwa = nazwa;
    }

    public Integer getIdrola() {
        return idrola;
    }

    public void setIdrola(Integer id_rola) {
        this.idrola = id_rola;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
}
