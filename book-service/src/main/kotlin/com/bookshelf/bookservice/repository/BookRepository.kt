package com.bookshelf.bookservice.repository

import com.bookshelf.bookservice.model.Book
import org.springframework.data.jpa.repository.JpaRepository

interface BookRepository:JpaRepository<Book,String> {

    fun findBookByIsbn(isbn:String):Book?
    fun getAllBooksByAuthor(author:String):List<Book>

}