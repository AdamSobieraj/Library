package com.crud.library.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Pracownicy")
public class EntityPracownicy {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    @Column(name = "id_pracownik")
    private Integer idpracownik;

    @NotNull
    @Column(name = "login")
    private String login;

    @NotNull
    @Column(name = "haslo")
    private String haslo;

    @ManyToOne
    @JoinColumn(name = "id_rola")
    private EntityRole idrola;

    public EntityPracownicy() {
    }

    public EntityPracownicy(Integer idpracownik, String login, String haslo) {
        this.idpracownik = idpracownik;
        this.login = login;
        this.haslo = haslo;
    }

    public EntityPracownicy(String login, String haslo) {
        this.login = login;
        this.haslo = haslo;
    }

    public EntityRole getIdrola() {
        return idrola;
    }

    public void setIdrola(EntityRole id_rola) {
        this.idrola = id_rola;
    }

    public Integer getIdpracownik() {
        return idpracownik;
    }

    public void setIdpracownik(Integer id_pracownik) {
        this.idpracownik = id_pracownik;
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
