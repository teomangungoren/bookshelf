package com.bookshelf.userservice.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.web.server.ServerHttpSecurity.http
import org.springframework.security.web.SecurityFilterChain

@Configuration
class SecurityConfig {

    @Bean
    open fun filterChain(http: HttpSecurity): SecurityFilterChainn {
        http {
            authorizeReque {
                authorize(anyRequest, authenticated)
            }
            formLogin { }
            httpBasic { }
        }
        return http.build()
    }
}