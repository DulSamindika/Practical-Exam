package com.example.practicalmc.data

object AppDatabase {

    private val users = mutableListOf<User>()

    fun addUser(user: User) {
        users.add(user)
    }

    fun getUser(email: String): User? {
        return users.find { it.email == email }
    }

    fun getAllUsers(): List<User> {
        return users
    }
}