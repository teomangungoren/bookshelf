package com.bookshelf.userservice.dto

import com.bookshelf.userservice.model.User

data class UserDto(
    val id:String?=null,
    val name:String?,
    val surname:String?,
    val phone:String?,
    val username:String?,
    val email:String?
){
    companion object{
        @JvmStatic
        fun convert(from:User):UserDto {
        return UserDto(
            from.id,
            from.name,
            from.surname,
            from.phone,
            from.username,
            from.email
        )
    }
    }
}
