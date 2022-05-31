package com.example.domain.usecases

import com.example.domain.repository.UserRepository
import javax.inject.Inject

class GetUsersRepository @Inject constructor(
    private val userRepository: UserRepository
) {

    suspend operator fun invoke() =
        userRepository.getUsers()

}