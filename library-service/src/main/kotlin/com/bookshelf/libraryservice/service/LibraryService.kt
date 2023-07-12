package com.bookshelf.libraryservice.service

import com.bookshelf.libraryservice.Request.AddBookRequest
import com.bookshelf.libraryservice.dto.LibraryDto
import com.bookshelf.libraryservice.exception.LibraryNotFoundException
import com.bookshelf.libraryservice.model.Library
import com.bookshelf.libraryservice.repository.LibraryRepository
import org.springframework.stereotype.Service

@Service
class LibraryService(private val libraryRepository: LibraryRepository) {

    fun getBooksInLibraryById(id:String):LibraryDto {
        val library=libraryRepository.findById(id)
            .orElseThrow { LibraryNotFoundException("Kullanıcıya ait kütüphane bulunamadı $id") }
        val libraryDto=LibraryDto(library.id);
        return libraryDto;
    }

    fun createLibrary():LibraryDto{
        val library=libraryRepository.save(Library());
        return LibraryDto(library.id);
    }


}