package com.example.bookshop.dao.impl;

import com.example.bookshop.config.DatabaseConfig;
import com.example.bookshop.dao.BookDao;
import com.example.bookshop.model.Book;
import com.example.bookshop.queries.BookQuery;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BookDaoImpl extends DatabaseConfig implements BookDao
{
    @Override
    public boolean insertBook(Book book) {
        try(Connection connection=connect()) {
            PreparedStatement preparedStatement=connection.prepareStatement(BookQuery.REGISTER);
            preparedStatement.setString(1,book.getBookName());
            preparedStatement.setString(2,book.getBookEdition());
            preparedStatement.setFloat(3,book.getBookPrice());

            int val=preparedStatement.executeUpdate();
            return val>0;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
