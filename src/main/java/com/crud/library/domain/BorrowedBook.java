package com.crud.library.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "BORROWED_BOOKS")
public class BorrowedBook {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "book_copy_id")
    private BookCopyStatus bookCopy;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users userId;

    @NotNull
    @Column(name = "borrowed_book_date")
    private LocalDate borrowedBookDate;

    @NotNull
    @Column(name = "return_book_date")
    private LocalDate returnBookDate;

    //

    public BorrowedBook(Long id, BookCopyStatus bookCopy, Users userId, LocalDate borrowedBookDate, LocalDate returnBookDate) {
        this.id = id;
        this.bookCopy = bookCopy;
        this.userId = userId;
        this.borrowedBookDate = borrowedBookDate;
        this.returnBookDate = returnBookDate;
    }

    public Long getId() {
        return id;
    }

    public BookCopyStatus getBookCopy() {
        return bookCopy;
    }

    public Users getUserId() {
        return userId;
    }

    public LocalDate getBorrowedBookDate() {
        return borrowedBookDate;
    }

    public LocalDate getReturnBookDate() {
        return returnBookDate;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setBookCopy(BookCopyStatus bookCopy) {
        this.bookCopy = bookCopy;
    }

    public void setUserId(Users userId) {
        this.userId = userId;
    }

    public void setBorrowedBookDate(LocalDate borrowedBookDate) {
        this.borrowedBookDate = borrowedBookDate;
    }

    public void setReturnBookDate(LocalDate returnBookDate) {
        this.returnBookDate = returnBookDate;
    }
}
