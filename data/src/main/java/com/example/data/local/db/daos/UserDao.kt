package com.example.data.local.db.daos

import androidx.room.*
import com.example.data.model.UserDto
import kotlinx.coroutines.flow.Flow

@Dao
interface UserDao {

    @Query("SELECT * FROM userdto")
    fun getUsers(): Flow<List<UserDto>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertUser(userDto: UserDto)

    @Delete
    suspend fun deleteUsers(userDto: UserDto)

    @Update
    suspend fun updateUsers(userDto: UserDto)
}