package com.example.data.local.repositories

import com.example.data.local.db.daos.UserDao
import com.example.data.model.UserDto

class UserRepository(private val userDao: UserDao) {
    suspend fun addUser(userDto: UserDto) {
        userDao.insertUser(userDto)
    }
}