package com.crud.library.controlle;

import com.crud.library.service.DbService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("v1/books")
public class BooksController {

//    private final DbService dbService;
//
//    private final BookMapper bookMapper;
//
//    public BooksController(DbService dbService, BookMapper bookMapper) {
//        this.dbService = dbService;
//        this.bookMapper = bookMapper;
//    }
//
//    @RequestMapping(method = RequestMethod.GET, value = "getBooks")
//    public List<BooksDto> getBooks(){
//        return bookMapper.mapToBookDtoList(dbService.getAllBooks());
//    }
//
//    @RequestMapping(method = RequestMethod.GET, value = "getBook")
//    public BooksDto getBook(@RequestParam Long id) throws NullPointerException{
//        return bookMapper.mapToBookDto(dbService.getBookById(id));
//    }
//
//    @RequestMapping(method = RequestMethod.POST, value = "addNewBook", consumes = APPLICATION_JSON_VALUE)
//    public void addNewBook(@RequestParam BooksDto booksDto){
//        bookMapper.mapToBookDto(dbService.saveBook(bookMapper.mapToBook(booksDto)));
//    }
//
//    @RequestMapping(method = RequestMethod.PUT, value = "updateBook")
//    public void updateBook(@RequestParam BooksDto booksDto){
//        bookMapper.mapToBookDto(dbService.saveBook(bookMapper.mapToBook(booksDto)));
//    }
//
//    @RequestMapping(method = RequestMethod.DELETE, value = "deleteBook")
//    public void deleteBook(@RequestParam Long id){
//        dbService.deleteBook(id);
//    }


}
