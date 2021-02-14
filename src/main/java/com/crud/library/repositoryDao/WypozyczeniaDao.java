package com.crud.library.repositoryDao;

import com.crud.library.domain.EntityWypozyczenia;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Transactional
@Repository
public interface WypozyczeniaDao extends CrudRepository<EntityWypozyczenia, Integer> {

    @Override
    List<EntityWypozyczenia> findAll();

    @Override
    EntityWypozyczenia save(EntityWypozyczenia entityWypozyczenia);

    Optional<EntityWypozyczenia> findByIdwypozyczenie(Integer id);

    void deleteByIdwypozyczenie(Integer id);
}
