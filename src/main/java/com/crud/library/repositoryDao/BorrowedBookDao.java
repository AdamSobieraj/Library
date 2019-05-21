package com.crud.library.repositoryDao;

import com.crud.library.domain.BorrowedBook;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Transactional
@Repository
public interface BorrowedBookDao extends CrudRepository<BorrowedBook, Long> {

    @Override
    List<BorrowedBook> findAll();

    @Override
    BorrowedBook save(BorrowedBook borrowedBook);

    Optional<BorrowedBook> findById(Long id);

}
