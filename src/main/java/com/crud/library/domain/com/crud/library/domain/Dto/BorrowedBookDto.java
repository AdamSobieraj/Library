package com.crud.library.domain.com.crud.library.domain.Dto;

import java.time.LocalDate;

public class BorrowedBookDto {

    private Long id;
    private Long bookCopyId;
    private Long userId;
    private LocalDate borrowedBookDate;
    private LocalDate returnBookDate;

    public BorrowedBookDto(Long id, Long bookCopyId, Long userId, LocalDate borrowedBookDate, LocalDate returnBookDate) {
        this.id = id;
        this.bookCopyId = bookCopyId;
        this.userId = userId;
        this.borrowedBookDate = borrowedBookDate;
        this.returnBookDate = returnBookDate;
    }

    public Long getId() {
        return id;
    }

    public Long getBookCopyId() {
        return bookCopyId;
    }

    public Long getUserId() {
        return userId;
    }

    public LocalDate getBorrowedBookDate() {
        return borrowedBookDate;
    }

    public LocalDate getReturnBookDate() {
        return returnBookDate;
    }
}
