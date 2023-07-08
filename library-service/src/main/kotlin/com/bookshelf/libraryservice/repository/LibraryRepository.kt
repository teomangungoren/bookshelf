package com.bookshelf.libraryservice.repository

import com.bookshelf.libraryservice.model.Library
import org.springframework.data.jpa.repository.JpaRepository

interface LibraryRepository:JpaRepository<Library,String>{
}