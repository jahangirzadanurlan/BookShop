package com.example.bookshop.controller;

import com.example.bookshop.model.Book;
import com.example.bookshop.service.BookService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;

import java.io.IOException;
import java.io.PrintWriter;
@RequiredArgsConstructor
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    private final BookService bookService;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter pw=resp.getWriter();
        resp.setContentType("text/html");

        String bookName=req.getParameter("bookName");
        String bookEdition=req.getParameter("bookEdition");
        Float bookPrice=Float.parseFloat(req.getParameter("bookPrice"));

        Book book=Book.builder()
                .bookName(bookName)
                .bookEdition(bookEdition)
                .bookPrice(bookPrice)
                .build();

        bookService.insertBook(book);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
