package com.bookshelf.bookservice.controller

import com.bookshelf.bookservice.dto.BookDto
import com.bookshelf.bookservice.dto.UpdateBookRequest
import com.bookshelf.bookservice.service.BookService
import org.jetbrains.annotations.NotNull
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/book")
@Validated
class BookController(private val bookService: BookService) {

    @GetMapping
    fun getAllBooks():ResponseEntity<List<BookDto>>{
      return ResponseEntity.ok(bookService.getAllBooks());
    }

    @GetMapping("/isbn/{isbn}")
    fun getBookByIsbn(@PathVariable @NotNull isbn:String):ResponseEntity<BookDto>{
        return ResponseEntity.ok(bookService.findByIsbn(isbn));
    }
    @GetMapping("/{id}")
    fun getBookById(@PathVariable @NotNull id:String):ResponseEntity<BookDto>{
        return ResponseEntity.ok(bookService.findById(id));
    }

    @PostMapping
    fun createBook(@RequestBody bookDto: BookDto):ResponseEntity<BookDto>{
        val createdBook=bookService.createBook(bookDto);
        return ResponseEntity(createdBook,HttpStatus.CREATED);
    }

    @PutMapping("/{isbn}")
    fun updateBook(@PathVariable isbn:String,@RequestBody updateBookRequest:UpdateBookRequest):ResponseEntity<BookDto>{
        val updatedBook=bookService.updateBook(isbn, updateBookRequest);
        return ResponseEntity.ok(updatedBook);
    }

    @DeleteMapping("/delete/{id}")
    fun deleteBookById(@PathVariable id:String){
        bookService.deleteBookById(id);
    }



}
