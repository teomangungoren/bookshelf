package com.bookshelf.libraryservice.dto

import com.bookshelf.libraryservice.model.Library

data class LibraryDto @JvmOverloads constructor(
    val id:String?,
    val bookList:List<BookDto>?=ArrayList()
) {
}