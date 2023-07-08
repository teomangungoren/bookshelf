package com.bookshelf.userservice.controller

import com.bookshelf.userservice.dto.SignUpRequest
import com.bookshelf.userservice.dto.UserDto
import com.bookshelf.userservice.service.AuthService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class SignUpController(private val authService:AuthService) {

    @PostMapping("/sign-up")
    fun createUser(@RequestBody signUpRequest: SignUpRequest):ResponseEntity<*>{
       val createdUser:UserDto?=authService.createUser(signUpRequest)
        if(createdUser==null){
            return ResponseEntity("User is not created.",HttpStatus.BAD_REQUEST)
        }
        return ResponseEntity.ok(createdUser);
    }
}