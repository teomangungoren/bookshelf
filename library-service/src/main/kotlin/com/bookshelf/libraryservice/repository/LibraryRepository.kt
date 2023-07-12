package com.bookshelf.libraryservice.repository

import com.bookshelf.libraryservice.dto.LibraryDto
import com.bookshelf.libraryservice.model.Library
import org.springframework.data.jpa.repository.JpaRepository

interface LibraryRepository:JpaRepository<Library,String>{

    fun getBooksByIsbn(isbn:String):LibraryDto;
}