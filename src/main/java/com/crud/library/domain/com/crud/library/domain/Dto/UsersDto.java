package com.crud.library.domain.com.crud.library.domain.Dto;

import java.time.LocalDate;

public class UsersDto {

    private Long id;
    private String name;
    private String surname;
    private LocalDate accountStartDate;

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

    public UsersDto(Long id, String name, String surname, LocalDate accountStartDate) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.accountStartDate = accountStartDate;
    }
}
