package com.example.data.local.repositories

import com.example.data.local.db.daos.UserDao
import com.example.data.model.toData
import com.example.data.model.toDomain
import com.example.domain.models.UserModel
import com.example.domain.repository.UserRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(
    private val userDao: UserDao
) : UserRepository {
    override fun getUsers(): Flow<List<UserModel>> =
        userDao.getUsers().map { it -> it.map { it.toDomain() } }

    override suspend fun insertAllUser(userModel: UserModel) {
        userDao.insertUser(userModel.toData())
    }


}