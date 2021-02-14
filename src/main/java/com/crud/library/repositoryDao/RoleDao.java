package com.crud.library.repositoryDao;

import com.crud.library.domain.EntityRole;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Transactional
@Repository
public interface RoleDao extends CrudRepository<EntityRole, Integer> {

    @Override
    List<EntityRole> findAll();

    @Override
    EntityRole save(EntityRole entityRole);

    Optional<EntityRole> findByIdrola(Integer id);

    void deleteByIdrola(Integer id);
}
