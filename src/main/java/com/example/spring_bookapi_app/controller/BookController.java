package com.example.spring_bookapi_app.controller; // 1. 경로 전체를 다 적어야 함

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

    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return bookService.findAllBooks();
    }

    @GetMapping("/books/{id}")
    public Book getBookById(@PathVariable Long id) {
        return bookService.findById(id);
    }

    @PostMapping("/books")
    public Book postBooks(@RequestBody Book requestBook) {
        return bookService.save(requestBook);
    }

    @PutMapping("/books/{id}") // 앞에 / 추가했습니다.
    public Book putBook(@PathVariable Long id, @RequestBody Book requestBook) {
        return bookService.putById(id, requestBook);
    }

    @DeleteMapping("/books/{id}")
    public Book deleteBook(@PathVariable Long id) {
        return bookService.deleteById(id);
    }
}