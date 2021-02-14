package com.crud.library.service;

import com.crud.library.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class DbService {

//    @Autowired
//    private BookCopyStatusDao bookCopyStatusDao;
//
//    @Autowired
//    private BooksDao booksDao;
//
//    @Autowired
//    private BorrowedBookDao borrowedBookDao;
//
//    @Autowired
//    private UserDao userDao;
//
//    //User section
//    public List<Users> getAllUsers() {
//        return userDao.findAll();
//    }
//
//    public Users getUserById(final Long userId) {
//        return userDao.findById(userId).orElse(null);
//    }
//
//    public Users saveUser(final Users users) {
//        return userDao.save(users);
//    }
//
//    public void deleteUser(final Long userId) {
//        userDao.deleteById(userId);
//    }
//
//    //Books section
//    public List<EntityKsiazki> getAllBooks() {
//        return booksDao.findAll();
//    }
//
//    public EntityKsiazki getBookById(final Long bookId) {
//        return booksDao.findById(bookId).orElse(null);
//    }
//
//    public EntityKsiazki saveBook(final EntityKsiazki entityKsiazki) {
//        return booksDao.save(entityKsiazki);
//    }
//
//    public void deleteBook(final Long bookId) {
//        booksDao.deleteById(bookId);
//    }
//
//    //Books Copy
//    public List<BookCopyStatus> getAllBookCopies() {
//        return bookCopyStatusDao.findAll();
//    }
//
//    public BookCopyStatus getBookCopyById(final Long bookCopyId) {
//        return bookCopyStatusDao.findById(bookCopyId).orElse(null);
//    }
//
//    public BookCopyStatus saveBookCopy(final BookCopyStatus bookCoppyStatus) {
//        return bookCopyStatusDao.save(bookCoppyStatus);
//    }
//
//    public void deleteBookCopy(final Long bookCopyId) {
//        bookCopyStatusDao.deleteById(bookCopyId);
//    }
//
//    //Borrowed Books section
//    public List<BorrowedBook> getAllBorrowedBooks() {
//        return borrowedBookDao.findAll();
//    }
//
//    public BorrowedBook saveBorrowedBook(final BorrowedBook borrowedBook) {
//        borrowedBook.getBookCopy().setRentalStatus(RentalStatus.BORROWED);
//        return borrowedBookDao.save(borrowedBook);
//    }
//
//    public void returnBorrowedBook(Long borrowedBookId) {
//        Optional<BorrowedBook> borrowedBook = borrowedBookDao.findById(borrowedBookId);
//        BorrowedBook borrowedBook1 = borrowedBook.get();
//        borrowedBook1.getBookCopy().setRentalStatus(RentalStatus.AVAILABLE);
//        bookCopyStatusDao.save(borrowedBook1.getBookCopy());
//        borrowedBook1.setReturnBookDate(LocalDate.now());
//        borrowedBookDao.save(borrowedBook1);
//    }
//    public void updateRentalStatus(Long bookCopyId, RentalStatus rentalStatus) {
//
//        Optional<BookCopyStatus> bookCopy = bookCopyStatusDao.findById(bookCopyId);
//        BookCopyStatus bookCopy1 = bookCopy.get();
//        bookCopy1.setRentalStatus(rentalStatus);
//        bookCopyStatusDao.save(bookCopy1);
//    }
//
//    public Long countAvailableBookCopies(String title) {
//
//        return bookCopyStatusDao.findAll().stream()
//                .filter(t -> t.getRentalStatus().equals(RentalStatus.AVAILABLE))
//                .filter(t -> t.getBook().getTitle().equals(title))
//                .count();
//    }

}
