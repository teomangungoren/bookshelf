package com.bookshelf.bookservice.controller

import com.bookshelf.bookservice.dto.BookDto
import com.bookshelf.bookservice.service.BookService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(name = "v1/book")
class BookController(private val bookService: BookService,) {

    @GetMapping
    fun getAllBooks():ResponseEntity<List<BookDto>>{
      return ResponseEntity.ok(bookService.getAllBooks());
    }

    @GetMapping("/book/{title}")
    fun getBookByTitle(@PathVariable title:String):ResponseEntity<BookDto>{
        return ResponseEntity.ok(bookService.)
    }
}
