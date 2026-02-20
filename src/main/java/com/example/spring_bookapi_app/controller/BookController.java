package com.example.spring_bookapi_app.controller;

import com.example.spring_bookapi_app.entity.Book; 
import com.example.spring_bookapi_app.service.BookService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/books")        // 전체 도서 목록 조회
    public List<Book> getAllBooks() {
        return bookService.findAllBooks();
    }

    @GetMapping("/books/{id}")        // 특정 도서 조회
    public Book getBookById(@PathVariable Long id) {
        return bookService.findById(id);
    }

    @PostMapping("/books")        // 도서 추가
    public Book postBooks(@RequestBody Book requestBook) {
        return bookService.save(requestBook);
    }

    @PutMapping("/books/{id}")        // 도서 정보 수정
    public Book putBook(@PathVariable Long id, @RequestBody Book requestBook) {
        return bookService.putById(id, requestBook);
    }

    @DeleteMapping("/books/{id}")        // 도서 삭제
    public Book deleteBook(@PathVariable Long id) {
        return bookService.deleteById(id);
    }
}
