package com.crud.library.mapper;

import com.crud.library.domain.Books;
import com.crud.library.domain.com.crud.library.domain.Dto.BooksDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class BookMapper {

    public Books mapToBook(final BooksDto bookDto) {
        return new Books(
                bookDto.getId(),
                bookDto.getTitle(),
                bookDto.getAuthor(),
                bookDto.getPublicationYear());
    }

    public BooksDto mapToBookDto(final Books book) {
        return new BooksDto(
                book.getId(),
                book.getTitle(),
                book.getAuthor(),
                book.getPublicationYear());
    }

    public List<BooksDto> mapToBookDtoList(final List<Books> booksList){
        return booksList.stream()
                .map(t -> new BooksDto(t.getId(),t.getTitle(), t.getAuthor(), t.getPublicationYear()))
                .collect(Collectors.toList());
    }

}
