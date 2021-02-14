package com.crud.library.controlle;

import com.crud.library.domain.RentalStatus;
import com.crud.library.service.DbService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("v1/bookcoppy")
public class BookCoppyController {

//    private final DbService dbservice;
//
//    private final BookCopyStatusMapper bookCopyStatusMapper;
//
//    public BookCoppyController(DbService dbservice, BookCopyStatusMapper bookCopyStatusMapper) {
//        this.dbservice = dbservice;
//        this.bookCopyStatusMapper = bookCopyStatusMapper;
//    }
//
//    @RequestMapping(method = RequestMethod.GET, value = "getBookCopies")
//    public List<BookCopyStatusDto> getBookCopies() {
//        return bookCopyStatusMapper.mapToBookCopiesDtoList(dbservice.getAllBookCopies());
//    }
//
//    @RequestMapping(method = RequestMethod.GET, value = "getBookCopy")
//    public BookCopyStatusDto getBookCopy(@RequestParam Long bookCopyId) throws TaskNotFoundException {
//        return bookCopyStatusMapper.mapToBookCopiesStatusDto(dbservice.getBookCopyById(bookCopyId));
//    }
//
//    @RequestMapping(method = RequestMethod.POST, value = "addBookCopy", consumes = APPLICATION_JSON_VALUE)
//    public void addBookCopy(@RequestBody BookCopyStatusDto bookCopyDto) {
//        bookCopyStatusMapper.mapToBookCopiesStatusDto(dbservice.saveBookCopy(bookCopyStatusMapper.mapToBookCopiesStatus(bookCopyDto)));
//    }
//
//    @RequestMapping(method = RequestMethod.PUT, value = "updateBookCopy")
//    public void updateBookCopy(@RequestBody BookCopyStatusDto bookCopyDto) {
//        bookCopyStatusMapper.mapToBookCopiesStatusDto(dbservice.saveBookCopy(bookCopyStatusMapper.mapToBookCopiesStatus(bookCopyDto)));
//    }
//
//    @RequestMapping(method = RequestMethod.DELETE, value = "deleteBookCopy")
//    public void deleteUser(@RequestParam Long bookCopyId) {
//        dbservice.deleteBookCopy(bookCopyId);
//    }
//
//    @RequestMapping(method = RequestMethod.PUT, value = "updateStatus")
//    public void updateStatus(@RequestParam Long bookCopyId, @RequestParam RentalStatus rentalStatus) {
//        dbservice.updateRentalStatus(bookCopyId, rentalStatus);
//    }
//
//    @RequestMapping(method = RequestMethod.GET, value = "countAvailableBookCopies")
//    public Long countAvailableBookCopies(@RequestParam String title) throws TaskNotFoundException {
//        return dbservice.countAvailableBookCopies(title);
//    }
}
