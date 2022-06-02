package com.example.roomts.ui.fragments.users

import com.example.data.local.repositories.UserRepositoryImpl
import com.example.domain.models.UserModel
import com.example.domain.usecases.GetUsersRepository
import com.example.domain.usecases.InsertUserUseCase
import com.example.roomts.base.BaseViewModel
import com.example.roomts.models.UserUI
import com.example.roomts.models.toDomain
import com.example.roomts.models.toUI
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class UserViewModel(
    private val userRepositoryImpl: UserRepositoryImpl,
//    private val getUsersRepository: GetUsersRepository,
//    private val insertUserUseCase: InsertUserUseCase
) : BaseViewModel() {

    fun getUser(): Flow<List<UserModel>> =
       userRepositoryImpl.getUsers()

    suspend fun insert(userUI: UserUI) {
        userRepositoryImpl.insertAllUser(userUI.toDomain())
    }
}