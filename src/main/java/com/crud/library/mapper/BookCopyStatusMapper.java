package com.crud.library.mapper;

import com.crud.library.domain.BookCopyStatus;
import com.crud.library.domain.com.crud.library.domain.Dto.BookCopyStatusDto;
import com.crud.library.repositoryDao.BooksDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class BookCopyStatusMapper {

    private final BooksDao booksDao;

    public BookCopyStatusMapper(BooksDao booksDao) {
        this.booksDao = booksDao;
    }

    public BookCopyStatus mapToBookCopiesStatus(final BookCopyStatusDto bookCopyStatusDto) {
        return new BookCopyStatus(
                bookCopyStatusDto.getBookId(),
                booksDao.findById(bookCopyStatusDto.getBookId()).get(),
                bookCopyStatusDto.getRentalStatus());
    }

    public BookCopyStatusDto mapToBookCopiesStatusDto(final BookCopyStatus bookCopyStatus) {
        return new BookCopyStatusDto(
                bookCopyStatus.getId(),
                bookCopyStatus.getBook().getId(),
                bookCopyStatus.getRentalStatus());
    }

    public List<BookCopyStatusDto> mapToBookCopiesDtoList(final List<BookCopyStatus> bookCopyList) {
        return bookCopyList.stream()
                .map(t -> new BookCopyStatusDto(t.getId(), t.getBook().getId(), t.getRentalStatus()))
                .collect(Collectors.toList());
    }
}
