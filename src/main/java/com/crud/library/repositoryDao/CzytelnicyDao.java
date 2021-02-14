package com.crud.library.repositoryDao;

import com.crud.library.domain.EntityCzytelnicy;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Transactional
@Repository
public interface CzytelnicyDao extends CrudRepository<EntityCzytelnicy, Integer> {

    @Override
    List<EntityCzytelnicy> findAll();

    @Override
    EntityCzytelnicy save(EntityCzytelnicy entityCzytelnicy);

    Optional<EntityCzytelnicy> findByIdczytelnik(Integer id);

    void deleteByIdczytelnik(Integer id);

}
