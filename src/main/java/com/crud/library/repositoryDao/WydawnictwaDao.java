package com.crud.library.repositoryDao;

import com.crud.library.domain.EntityWydawnictwa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Transactional
@Repository
public interface WydawnictwaDao extends CrudRepository<EntityWydawnictwa, Integer> {

    @Override
    List<EntityWydawnictwa> findAll();

    @Override
    EntityWydawnictwa save(EntityWydawnictwa entityWydawnictwa);

    Optional<EntityWydawnictwa> findByIdWydawnictwo(Integer id);

    void deleteByIdWydawnictwo(Integer id);
}
