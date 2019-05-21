package com.crud.library.domain.com.crud.library.domain.Dto;

import com.crud.library.domain.RentalStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BookCopyStatusDto {

    private Long titleId;
    private Long bookId;
    private RentalStatus rentalStatus;

    //


    public BookCopyStatusDto(Long titleId, Long bookId, RentalStatus rentalStatus) {
        this.titleId = titleId;
        this.bookId = bookId;
        this.rentalStatus = rentalStatus;
    }

    public Long getTitleId() {
        return titleId;
    }

    public Long getBookId() {
        return bookId;
    }

    public RentalStatus getRentalStatus() {
        return rentalStatus;
    }
}
