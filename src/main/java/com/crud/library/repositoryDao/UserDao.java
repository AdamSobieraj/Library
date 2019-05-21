package com.crud.library.repositoryDao;


import com.crud.library.domain.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Transactional
@Repository
public interface UserDao extends CrudRepository<Users, Long> {

    @Override
    List<Users> findAll();

    @Override
    Users save(Users user);

    Optional<Users> findById(Long id);

    void deleteById(Long id);
}
