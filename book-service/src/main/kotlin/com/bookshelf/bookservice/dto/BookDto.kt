package com.bookshelf.bookservice.dto

import com.bookshelf.bookservice.model.Book

data class BookDto @JvmOverloads constructor(
    val id:String?=null,
    val title:String,
    val author:String,
    val categoryName:String,
    val bookYear:Int,
    val isbn:String
){

    companion object{
        @JvmStatic
        fun convert(from:Book):BookDto{
            return BookDto(
                from.id,
                from.title,
                from.author,
                from.categoryName,
                from.bookYear,
                from.isbn
            )
        }
    }
}
