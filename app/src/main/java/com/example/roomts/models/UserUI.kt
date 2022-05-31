package com.example.roomts.models

import com.example.domain.models.UserModel

data class UserUI(
    val id: Int,
    val userName: String
)

fun UserModel.toUI() =
    UserUI(id, userName)