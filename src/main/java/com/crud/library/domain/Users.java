package com.crud.library.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//@Getter
@Setter
@NoArgsConstructor
//@AllArgsConstructor
@Entity
@Table(name = "USERS")
public class Users {

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Column(name = "name")
    private String name;

    @NotNull
    @Column(name = "surname")
    private String surname;

    @Column(name = "account_start_date")
    private LocalDate accountStartDate;

    @OneToMany(
            targetEntity = BorrowedBook.class,
            mappedBy = "userId",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    private List<BorrowedBook> borrowedBooks = new ArrayList<>();
///////////////////
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public LocalDate getAccountStartDate() {
        return accountStartDate;
    }

    public List<BorrowedBook> getBorrowedBooks() {
        return borrowedBooks;
    }

    public Users(Long id, String name, String surname, LocalDate accountStartDate) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.accountStartDate = accountStartDate;
    }
}
