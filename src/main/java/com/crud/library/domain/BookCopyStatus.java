package com.crud.library.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "BOOK_COPIES")
public class BookCopyStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Books book;

    @Column(name = "status")
    private RentalStatus rentalStatus;

    @OneToMany(
            targetEntity = BorrowedBook.class,
            mappedBy = "bookCopy",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    private List<BorrowedBook> borrowedBooks = new ArrayList<>();

    //

    public BookCopyStatus(Long id, Books book, RentalStatus rentalStatus) {
        this.id = id;
        this.book = book;
        this.rentalStatus = rentalStatus;
    }

    public Long getId() {
        return id;
    }

    public Books getBook() {
        return book;
    }

    public RentalStatus getRentalStatus() {
        return rentalStatus;
    }

    public List<BorrowedBook> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setBook(Books book) {
        this.book = book;
    }

    public void setRentalStatus(RentalStatus rentalStatus) {
        this.rentalStatus = rentalStatus;
    }

    public void setBorrowedBooks(List<BorrowedBook> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }
}
