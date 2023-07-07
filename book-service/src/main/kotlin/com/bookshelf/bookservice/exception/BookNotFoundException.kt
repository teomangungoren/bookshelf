package com.bookshelf.bookservice.exception

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus

@ResponseStatus(HttpStatus.NOT_FOUND)
class BookNotFoundException(s:String): RuntimeException(s) {
}