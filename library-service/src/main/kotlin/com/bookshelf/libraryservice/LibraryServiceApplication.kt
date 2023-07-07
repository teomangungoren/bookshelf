package com.bookshelf.libraryservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LibraryServiceApplication

fun main(args: Array<String>) {
	runApplication<LibraryServiceApplication>(*args)
}
