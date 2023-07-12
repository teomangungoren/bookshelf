package com.bookshelf.libraryservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
class LibraryServiceApplication

fun main(args: Array<String>) {
	runApplication<LibraryServiceApplication>(*args)
}
