package com.example.domain.usecases

import com.example.domain.repository.UserRepository
import javax.inject.Inject

class GetUsersUseCase @Inject constructor(
    private val userRepository: UserRepository
) {

    operator fun invoke() =
        userRepository.getUsers()

}