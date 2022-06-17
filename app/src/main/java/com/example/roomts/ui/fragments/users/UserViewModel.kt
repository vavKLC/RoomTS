package com.example.roomts.ui.fragments.users

import androidx.lifecycle.viewModelScope
import com.example.domain.models.UserModel
import com.example.domain.usecases.GetUsersUseCase
import com.example.domain.usecases.InsertUserUseCase
import com.example.roomts.base.BaseViewModel
import com.example.roomts.models.UserUI
import com.example.roomts.models.toDomain
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch

@HiltViewModel
class UserViewModel(
    private val getUsersUseCase: GetUsersUseCase,
    private val insertUserUseCase: InsertUserUseCase
) : BaseViewModel() {

    fun getUser(): Flow<List<UserModel>> =
        getUsersUseCase.invoke()

    fun insert(userUI: UserUI) {
        viewModelScope.launch(Dispatchers.IO) { insertUserUseCase.invoke(userUI.toDomain()) }
    }
}