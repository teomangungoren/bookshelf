package com.bookshelf.libraryservice.dto

class BookDto @JvmOverloads constructor(
    val id:String?=null,
    val title:String?="",
    val author:String?="",
    val isbn:String?=""
) {
}