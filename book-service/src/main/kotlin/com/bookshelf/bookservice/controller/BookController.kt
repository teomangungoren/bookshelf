package com.bookshelf.bookservice.controller

import com.bookshelf.bookservice.dto.BookDto
import com.bookshelf.bookservice.service.BookService
import org.jetbrains.annotations.NotNull
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(name = "v1/book")
@Validated
class BookController(private val bookService: BookService,) {

    @GetMapping
    fun getAllBooks():ResponseEntity<List<BookDto>>{
      return ResponseEntity.ok(bookService.getAllBooks());
    }

    @GetMapping("/book/{isbn}")
    fun getBookByTitle(@PathVariable @NotNull isbn:String):ResponseEntity<BookDto>{
        return ResponseEntity.ok(bookService.findByIsbn(isbn));
    }
}
