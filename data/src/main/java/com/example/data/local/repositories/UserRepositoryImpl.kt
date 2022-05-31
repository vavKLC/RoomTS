package com.example.data.local.repositories

import com.example.data.local.db.daos.UserDao
import com.example.domain.either.Either
import com.example.domain.models.UserModel
import com.example.domain.repository.UserRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(
    private val userDao: UserDao
): UserRepository {
    override suspend fun getUsers(): Flow<Either<String, List<UserModel>>> {
        TODO("Not yet implemented")
    }

    override suspend fun insertAllUser(userModel: UserModel) {
        TODO("Not yet implemented")
    }

}