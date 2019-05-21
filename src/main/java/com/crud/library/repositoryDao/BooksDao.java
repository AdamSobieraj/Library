package com.crud.library.repositoryDao;

import com.crud.library.domain.Books;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;


@Transactional
@Repository
public interface BooksDao extends CrudRepository<Books, Long> {

    @Override
    List<Books> findAll();

    @Override
    Books save(Books book);

    Optional<Books> findById(Long id);

    void deleteById(Long id);
}
