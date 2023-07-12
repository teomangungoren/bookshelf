package com.bookshelf.bookservice.dto

data class UpdateBookRequest(
    val title:String,
    val author:String,
    val categoryName:String,
    val bookYear:Int
)
