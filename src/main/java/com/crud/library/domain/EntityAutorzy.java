package com.crud.library.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Autrzy")
public class EntityAutorzy {

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_autora")
    private Integer idautora;

    @NotNull
    @Column(name = "imie")
    private String imie;

    @NotNull
    @Column(name = "nazwisko")
    private String nazwisko;

    public EntityAutorzy() {
    }

    public EntityAutorzy(Integer idautora, String imie, String nazwisko) {
        this.idautora = idautora;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public EntityAutorzy(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public Integer getIdautora() {
        return idautora;
    }

    public void setIdautora(Integer id_autora) {
        this.idautora = id_autora;
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
