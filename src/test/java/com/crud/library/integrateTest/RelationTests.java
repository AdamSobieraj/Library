package com.crud.library.integrateTest;

import com.crud.library.domain.*;
import com.crud.library.repositoryDao.CzytelnicyDao;
import com.crud.library.repositoryDao.RoleDao;
import com.crud.library.repositoryDao.WydawnictwaDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RelationTests {

    @Autowired
    private RoleDao roleDao;

    @Autowired
    private WydawnictwaDao wydawnictwaDao;

    @Autowired
    private CzytelnicyDao czytelnicyDao;

    @Test
    public void relationRolePracownicyTest(){
        //Given
        EntityPracownicy pracownik1 = new EntityPracownicy(1,"JózINA", "98D2JRJ695ABP");
        EntityPracownicy pracownik2 = new EntityPracownicy(2,"Józo", "98D2JRJ695ABP");

        EntityRole rola= new EntityRole(1,"Pracownik magazynowy");

        rola.getListaPracownikow().add(pracownik1);
        rola.getListaPracownikow().add(pracownik2);

        pracownik1.setIdrola(rola);
        pracownik2.setIdrola(rola);

        //When
        roleDao.save(rola);
        int id = rola.getIdrola();

        //Then
        Assert.assertNotEquals(0, id);

        //CleanUp
        roleDao.deleteByIdrola(rola.getIdrola());

    }

    @Test
    public void relationCzytelnikWyporzyczeniaTest(){
        //Given
        EntityCzytelnicy entityCzytelnicy = new EntityCzytelnicy(1,"MikUDA","KAKU535TPISII","b.d.",666777333, Date.valueOf("1982-12-12"));
        EntityWypozyczenia entityWypozyczenia1 = new EntityWypozyczenia(1,15, Date.valueOf("1960-05-16"),27,Date.valueOf("1960-06-29"),10);
        EntityWypozyczenia entityWypozyczenia2 = new EntityWypozyczenia(2,16,Date.valueOf("1960-05-16"),27,Date.valueOf("1960-06-29"),10);

        entityCzytelnicy.getListaWyporzyczen().add(entityWypozyczenia1);
        entityCzytelnicy.getListaWyporzyczen().add(entityWypozyczenia2);

        entityWypozyczenia1.setIdczytelnik(entityCzytelnicy);
        entityWypozyczenia2.setIdczytelnik(entityCzytelnicy);

        //When
        czytelnicyDao.save(entityCzytelnicy);
        int id = entityCzytelnicy.getIdczytelnik();

        //Then
        Assert.assertNotEquals(0,id);

        //CleanUp
        czytelnicyDao.deleteByIdczytelnik(entityCzytelnicy.getIdczytelnik());
    }

    @Test
    public void relationWydawnictwaKsiazkiTest(){
        //Given
        EntityKsiazki entityKsiazki1 = new EntityKsiazki(1,"8176CKGBXPI6F",21,"Muzy Młodej Polski","brak opisu",1,1953,"1953");
        EntityKsiazki entityKsiazki2 = new EntityKsiazki(2,"8176CKGBXPI6F",21,"Muzy Młodej Polski","brak opisu",1,1953,"1953");
        EntityWydawnictwa entityWydawnictwa = new EntityWydawnictwa(1,"Andromeda");

        entityWydawnictwa.getListaKsiazek().add(entityKsiazki1);
        entityWydawnictwa.getListaKsiazek().add(entityKsiazki2);

        entityKsiazki1.setIdWydawnictwo(entityWydawnictwa);
        entityKsiazki2.setIdWydawnictwo(entityWydawnictwa);

        //When
        wydawnictwaDao.save(entityWydawnictwa);
        int id = entityWydawnictwa.getIdWydawnictwo();

        //Then
        Assert.assertNotEquals(0, id);

//        //CleanUp
//        wydawnictwaDao.deleteByIdwydawnictwo(entityWydawnictwa.getIdWydawnictwo());
    }

}
