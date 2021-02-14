package com.crud.library.controlle;

import com.crud.library.service.DbService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("v1/borrowedbooks")
public class BorrowedBookController {

//    private final DbService dbService;
//
//    private final BorrowedBookMapper borrowedBookMapper;
//
//    public BorrowedBookController(DbService dbService, BorrowedBookMapper borrowedBookMapper) {
//        this.dbService = dbService;
//        this.borrowedBookMapper = borrowedBookMapper;
//    }
//
//    @RequestMapping(method = RequestMethod.GET, value = "getBorrowedBooks")
//    public List<BorrowedBookDto> getBorrowedBooks() {
//        return borrowedBookMapper.mapToBorrowedBooksDtoList(dbService.getAllBorrowedBooks());
//    }
//
//    @RequestMapping(method = RequestMethod.POST, value = "borrowBook", consumes = APPLICATION_JSON_VALUE)
//    public void borrowBook(@RequestBody BorrowedBookDto borrowedBookDto) {
//        borrowedBookMapper.maptoBorrowedBookDto(dbService.saveBorrowedBook(borrowedBookMapper.mapToBorrowedBook(borrowedBookDto)));
//    }
//
//    @RequestMapping(method = RequestMethod.PUT, value = "returnBook")
//    public void returnBook(@RequestParam Long borrowedBookId) {
//        dbService.returnBorrowedBook(borrowedBookId);
//    }
}
