package com.example.domain.usecases

import com.example.domain.models.UserModel
import com.example.domain.repository.UserRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class InsertUserUseCase @Inject constructor(
    private val userRepository: UserRepository
) {
    operator fun invoke(userModel: UserModel) =
        userRepository.insertAllUser(userModel)

}