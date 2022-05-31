package com.example.domain.repository

import com.example.domain.either.Either
import com.example.domain.models.UserModel


interface UserRepository {
    suspend fun getUsers(): kotlinx.coroutines.flow.Flow<Either<String, List<UserModel>>>
    suspend fun insertAllUser(userModel: UserModel)
}