package com.crud.library.repositoryDao;

import com.crud.library.domain.EntityKsiazki;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Transactional
@Repository
public interface KsiazkiDao extends CrudRepository<EntityKsiazki, Integer> {

    @Override
    List<EntityKsiazki> findAll();

    @Override
    EntityKsiazki save(EntityKsiazki entityKsiazki);

    Optional<EntityKsiazki> findByIdksiazka(Integer id);

    void deleteByIdksiazka(Integer id);
}
