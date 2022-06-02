package com.example.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.domain.models.UserModel

@Entity
data class UserDto(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val userName: String,
)

fun UserDto.toDomain() =
    UserModel(id, userName)

fun UserModel.toData() = UserDto(id, userName)