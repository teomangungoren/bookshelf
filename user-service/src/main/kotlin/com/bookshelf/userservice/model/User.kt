package com.bookshelf.userservice.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.Table
import org.hibernate.annotations.GenericGenerator

@Entity
@Table(name = "users")
data class User @JvmOverloads public constructor(
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    val id:String?="",
    val name:String?,
    val surname:String?,
    val username:String?,
    val phone:String?,
    val email:String?,
    val password:String?


)
