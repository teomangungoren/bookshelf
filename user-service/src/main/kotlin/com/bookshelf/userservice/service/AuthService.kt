package com.bookshelf.userservice.service

import com.bookshelf.userservice.controller.SignUpController
import com.bookshelf.userservice.dto.SignUpRequest
import com.bookshelf.userservice.dto.UserDto
import com.bookshelf.userservice.model.User
import com.bookshelf.userservice.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class AuthService(private val userRepository: UserRepository) {

    fun createUser(signUpRequest: SignUpRequest):UserDto{
        val user=User(id = null,
            signUpRequest.name,
            signUpRequest.surname,
            signUpRequest.username,
            signUpRequest.phone,
            signUpRequest.email,
            signUpRequest.password);
        return UserDto.convert(userRepository.save(user));

    }

}