package com.bookshelf.bookservice.service

import com.bookshelf.bookservice.dto.BookDto
import com.bookshelf.bookservice.dto.UpdateBookRequest
import com.bookshelf.bookservice.exception.BookNotFoundException
import com.bookshelf.bookservice.model.Book
import com.bookshelf.bookservice.repository.BookRepository
import org.springframework.stereotype.Service
import java.util.stream.Collectors

@Service
class BookService(private val bookRepository:BookRepository) {

     fun getAllBooks():List<BookDto> {
         return bookRepository.findAll()
             .stream()
             .map(BookDto::convert)
             .collect(Collectors.toList());
     }

    fun findById(id:String):BookDto{
        return bookRepository.findById(id)
            .map(BookDto::convert)
            .orElseThrow { BookNotFoundException("$id id'li kitap bulunamadı") }
    }

    fun findByIsbn(isbn:String):BookDto{
        return bookRepository.findBookByIsbn(isbn);
    }

    fun getBooksByAuthor(author:String):List<BookDto>{
        return bookRepository.getAllBooksByAuthor(author)
            .stream()
            .map(BookDto::convert)
            .collect(Collectors.toList());
    }

    fun createBook(bookDto:BookDto):BookDto{
        val book=Book(bookDto.id,bookDto.title,bookDto.author,bookDto.categoryName,bookDto.bookYear,bookDto.isbn);
        return BookDto.convert(bookRepository.save(book));
    }

    fun updateBook(isbn:String,updateBookRequest: UpdateBookRequest):BookDto{
        val book=bookRepository.findBookByIsbn(isbn);
        val updatedBook=Book(book.id,updateBookRequest.title,updateBookRequest.author,updateBookRequest.categoryName,
            updateBookRequest.bookYear,book.isbn);
        bookRepository.save(updatedBook);
        return BookDto.convert(updatedBook);

    }fun deleteBookById(id:String){
        bookRepository.deleteById(id);
    }



}

