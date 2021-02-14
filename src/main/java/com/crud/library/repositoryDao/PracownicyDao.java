package com.crud.library.repositoryDao;

import com.crud.library.domain.EntityPracownicy;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Transactional
@Repository
public interface PracownicyDao extends CrudRepository<EntityPracownicy, Integer> {

    @Override
    List<EntityPracownicy> findAll();

    @Override
    EntityPracownicy save(EntityPracownicy entityPracownicy);

    Optional<EntityPracownicy> findByIdpracownik(Integer id);

    void deleteByIdpracownik(Integer id);
}
