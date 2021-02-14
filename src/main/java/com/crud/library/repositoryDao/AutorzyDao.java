package com.crud.library.repositoryDao;

import com.crud.library.domain.EntityAutorzy;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Transactional
@Repository
public interface AutorzyDao extends CrudRepository<EntityAutorzy, Integer> {

    @Override
    List<EntityAutorzy> findAll();

    @Override
    EntityAutorzy save(EntityAutorzy entityAutorzy);

    Optional<EntityAutorzy> findByIdautora(Integer id);

    void deleteByIdautora(Integer id);

}
