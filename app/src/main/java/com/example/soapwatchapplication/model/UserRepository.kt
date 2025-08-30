package com.example.soapwatchapplication.model

interface UserRepository {
    suspend fun getUserEmail(email: String): User
    suspend fun getUserPassword(password: String): User
    fun authenticate(email: String, password: String): User? {
        return if (email == "example@email.com" && password == "123") {
           User("Juan", "Dela Cruz", "example@email.com", "123")
        } else null
    }

}
