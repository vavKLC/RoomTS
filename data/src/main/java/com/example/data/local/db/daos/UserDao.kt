package com.example.data.local.db.daos

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.data.model.UserDto

@Dao
interface UserDao {

    @Query("SELECT * FROM userdto")
    suspend fun getUsers(): LiveData<List<UserDto>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertUser(userDto: UserDto)

    @Delete
    suspend fun deleteUsers(userDto: UserDto)

    @Update
    suspend fun updateUsers(userDto: UserDto)
}