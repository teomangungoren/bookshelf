package com.bookshelf.libraryservice.controller

import com.bookshelf.libraryservice.dto.LibraryDto
import com.bookshelf.libraryservice.service.LibraryService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/library")
class LibraryController(private final val libraryService: LibraryService) {

    @PostMapping
    fun createLibrary():ResponseEntity<LibraryDto>{
        return ResponseEntity.ok(libraryService.createLibrary());
    }

    @GetMapping("{id}")
    fun getUserLibraryById(@PathVariable id:String):ResponseEntity<LibraryDto>{
        return ResponseEntity.ok(libraryService.getBooksInLibraryById(id));
    }







}