package com.crud.library.repositoryDao;

import com.crud.library.domain.EntityKategorie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Transactional
@Repository
public interface KategorieDao extends CrudRepository<EntityKategorie, Integer> {

    @Override
    List<EntityKategorie> findAll();

    @Override
    EntityKategorie save(EntityKategorie entityKategorie);

    Optional<EntityKategorie> findByIdkategoria(Integer id);

    void deleteByIdkategoria(Integer id);
}
