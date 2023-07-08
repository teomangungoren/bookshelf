package com.bookshelf.libraryservice.dto

class BookDto @JvmOverloads constructor(
    val id:String,
    val title:String?="",
    val author:String?="",
    val pressYear:Int?=0,
    val isbn:String?=""
) {
}