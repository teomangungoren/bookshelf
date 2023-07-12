package com.bookshelf.bookservice.repository

import com.bookshelf.bookservice.dto.BookDto
import com.bookshelf.bookservice.model.Book
import org.springframework.data.jpa.repository.JpaRepository
import java.util.Optional

interface BookRepository:JpaRepository<Book,String> {

    fun findBookByIsbn(isbn:String):BookDto
    fun getAllBooksByAuthor(author:String):List<Book>

}