package com.example.bookshop.service.impl;

import com.example.bookshop.dao.BookDao;
import com.example.bookshop.model.Book;
import com.example.bookshop.service.BookService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class BookServiceImpl implements BookService {
    private final BookDao bookDao;
    @Override
    public void insertBook(Book book) {
        bookDao.insertBook(book);
    }
}
