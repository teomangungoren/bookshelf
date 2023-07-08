package com.bookshelf.userservice.repository

import com.bookshelf.userservice.model.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository:JpaRepository<User,String> {
}