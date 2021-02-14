package com.crud.library.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Date;

@Entity
@Table(name = "Wypozyczenia")
public class EntityWypozyczenia {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    @Column(name = "id_wypozyczenie")
    private Integer idwypozyczenie;

    @ManyToOne
    @JoinColumn(name = "id_czytelnik")
    private EntityCzytelnicy idczytelnik;

    @NotNull
    @Column(name = "id_ksiazka")
    private Integer idksiazka;

    @NotNull
    @Column(name = "data_wypozyczenia")
    private Date dataWypozyczenia;

    @NotNull
    @Column(name = "id_racownik_wypozyczenie")
    private Integer idPracownikWypozyczenie;

    @NotNull
    @Column(name = "data_oddania")
    private Date dataOddania;

    @NotNull
    @Column(name = "id_pracownik_oddanie")
    private Integer idPracownikOddanie;



    public EntityWypozyczenia() {
    }

    public EntityWypozyczenia(Integer idwypozyczenie, Integer idksiazka, Date dataWypozyczenia, Integer idPracownikWypozyczenie, Date dataOddania, Integer idPracownikOddanie) {
        this.idwypozyczenie = idwypozyczenie;
        this.idksiazka = idksiazka;
        this.dataWypozyczenia = dataWypozyczenia;
        this.idPracownikWypozyczenie = idPracownikWypozyczenie;
        this.dataOddania = dataOddania;
        this.idPracownikOddanie = idPracownikOddanie;
    }

    public EntityWypozyczenia(Integer idksiazka, Date dataWypozyczenia, Integer idPracownikWypozyczenie, Date dataOddania, Integer idPracownikOddanie) {
        this.idksiazka = idksiazka;
        this.dataWypozyczenia = dataWypozyczenia;
        this.idPracownikWypozyczenie = idPracownikWypozyczenie;
        this.dataOddania = dataOddania;
        this.idPracownikOddanie = idPracownikOddanie;
    }

    public EntityCzytelnicy getIdczytelnik() {
        return idczytelnik;
    }

    public void setIdczytelnik(EntityCzytelnicy idczytelnik) {
        this.idczytelnik = idczytelnik;
    }

    public Integer getIdwypozyczenie() {
        return idwypozyczenie;
    }

    public void setIdwypozyczenie(Integer id_wypozyczenie) {
        this.idwypozyczenie = id_wypozyczenie;
    }

    public Integer getIdksiazka() {
        return idksiazka;
    }

    public void setIdksiazka(Integer id_ksiazka) {
        this.idksiazka = id_ksiazka;
    }

    public Date getDataWypozyczenia() {
        return dataWypozyczenia;
    }

    public void setDataWypozyczenia(Date data_wypozyczenia) {
        this.dataWypozyczenia = data_wypozyczenia;
    }

    public Integer getIdPracownikWypozyczenie() {
        return idPracownikWypozyczenie;
    }

    public void setIdPracownikWypozyczenie(Integer id_racownik_wypozyczenie) {
        this.idPracownikWypozyczenie = id_racownik_wypozyczenie;
    }

    public Date getDataOddania() {
        return dataOddania;
    }

    public void setDataOddania(Date data_oddania) {
        this.dataOddania = data_oddania;
    }

    public Integer getIdPracownikOddanie() {
        return idPracownikOddanie;
    }

    public void setIdPracownikOddanie(Integer id_pracownik_oddanie) {
        this.idPracownikOddanie = id_pracownik_oddanie;
    }
}
