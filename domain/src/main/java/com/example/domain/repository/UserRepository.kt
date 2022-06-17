package com.example.domain.repository

import com.example.domain.models.UserModel


interface UserRepository {
    fun getUsers(): kotlinx.coroutines.flow.Flow<List<UserModel>>
    fun insertAllUser(userModel: UserModel)
}