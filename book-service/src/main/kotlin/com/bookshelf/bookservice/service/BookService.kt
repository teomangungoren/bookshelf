package com.bookshelf.bookservice.service

import com.bookshelf.bookservice.dto.BookDto
import com.bookshelf.bookservice.exception.BookNotFoundException
import com.bookshelf.bookservice.repository.BookRepository
import org.springframework.stereotype.Service
import java.util.stream.Collectors

@Service
class BookService(private val bookRepository:BookRepository) {

     fun getAllBooks():List<BookDto> {
         return bookRepository.findAll()
             .map { book->BookDto.convert(book) }
             .toList();
     }

    fun findByIsbn(isbn:String):BookDto{
        return bookRepository.findById(isbn)
            .map(BookDto::convert)
            .orElseThrow { BookNotFoundException(isbn) };
    }

    fun getBooksByAuthor(author:String):List<BookDto>{
        return bookRepository.getAllBooksByAuthor(author)
            .stream()
            .map(BookDto::convert)
            .collect(Collectors.toList());
    }
}

