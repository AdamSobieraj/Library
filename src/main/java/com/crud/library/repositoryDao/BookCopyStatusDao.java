package com.crud.library.repositoryDao;

import com.crud.library.domain.BookCopyStatus;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Transactional
@Repository
public interface BookCopyStatusDao extends CrudRepository<BookCopyStatus, Long> {

    @Override
    List<BookCopyStatus> findAll();

    @Override
    BookCopyStatus save(BookCopyStatus bookCopy);

    Optional<BookCopyStatus> findById(Long id);

    void deleteById(Long id);
}
