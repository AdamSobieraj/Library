package com.crud.library.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Czytelnicy")
public class EntityCzytelnicy {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    @Column(name = "id_czytelnik")
    private Integer idczytelnik;

    @NotNull
    @Column(name = "login")
    private String login;

    @NotNull
    @Column(name = "haslo")
    private String haslo;

    @NotNull
    @Column(name = "email")
    private String email;

    @NotNull
    @Column(name = "telefon")
    private Integer telefon;

    @NotNull
    @Column(name = "data_urodzenia")
    private Date data_urodzenia;

    @OneToMany(
            targetEntity = EntityWypozyczenia.class,
            mappedBy = "idczytelnik",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    private List<EntityWypozyczenia> listaWyporzyczen = new ArrayList<>();

    public EntityCzytelnicy() {
    }

    public EntityCzytelnicy(Integer idczytelnik, String login, String haslo, String email, Integer telefon, Date data_urodzenia) {
        this.idczytelnik = idczytelnik;
        this.login = login;
        this.haslo = haslo;
        this.email = email;
        this.telefon = telefon;
        this.data_urodzenia = data_urodzenia;
    }

    public EntityCzytelnicy(String login, String haslo, String email, Integer telefon, Date data_urodzenia) {
        this.login = login;
        this.haslo = haslo;
        this.email = email;
        this.telefon = telefon;
        this.data_urodzenia = data_urodzenia;
    }

    public List<EntityWypozyczenia> getListaWyporzyczen() {
        return listaWyporzyczen;
    }

    public void setListaWyporzyczen(List<EntityWypozyczenia> listaWyporzyczen) {
        this.listaWyporzyczen = listaWyporzyczen;
    }

    public Integer getIdczytelnik() {
        return idczytelnik;
    }

    public void setIdczytelnik(Integer id_czytelnik) {
        this.idczytelnik = id_czytelnik;
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

    public Date getData_urodzenia() {
        return data_urodzenia;
    }

    public void setData_urodzenia(Date data_urodzenia) {
        this.data_urodzenia = data_urodzenia;
    }
}
