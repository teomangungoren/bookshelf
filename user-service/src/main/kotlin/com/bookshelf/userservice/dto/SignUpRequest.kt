package com.bookshelf.userservice.dto

data class SignUpRequest(

    val name:String?,
    val surname:String?,
    val username:String?,
    val phone:String?,
    val email:String?,
    val password:String?

)
