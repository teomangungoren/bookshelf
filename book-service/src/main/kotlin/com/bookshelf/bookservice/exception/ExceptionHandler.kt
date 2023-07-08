package com.bookshelf.bookservice.exception

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice
import java.lang.Exception

@RestControllerAdvice
class ExceptionHandler {

    @ExceptionHandler(BookNotFoundException::class)
    fun handleException(exception: BookNotFoundException):ResponseEntity<Any>{
        return ResponseEntity(exception.message,HttpStatus.NOT_FOUND);
    }
}