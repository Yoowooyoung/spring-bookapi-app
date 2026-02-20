package com.example.spring_bookapi_app.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.example.spring_bookapi_app.entity.Book;
import com.example.spring_bookapi_app.repository.BookRepository;

@Service
public class BookService {

	private final BookRepository bookRepository;

	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	public List<Book> findAllBooks() {		// 전체 도서 목록 조회
		return bookRepository.findAll();
	}

	public Book findById(Long id) {		// 특정 도서 조회
		return bookRepository.findById(id).orElse(null);
	}

	public Book save(Book book) {		// 도서 추가
		return bookRepository.save(book);
	}

	public Book putById(Long id, Book putBook) {		// 도서 정보 수정
		Book book = bookRepository.findById(id).orElse(null);
		if(book != null) {
			book.setTitle(putBook.getTitle());		// 기존 book에 putBook(수정내용) 덮어쓰기
			book.setAuthor(putBook.getAuthor());
			book.setIsbn(putBook.getIsbn());
			book.setPublishedDate(putBook.getPublishedDate());
			return bookRepository.save(book);
		}
		return null;
	}

	public Book deleteById(Long id) {		// 도서 삭제
		Book book = bookRepository.findById(id).orElse(null);
		if(book != null) {
			bookRepository.delete(book);
			return book;		// return 삭제내역
		}
		return null;
	}
}