package com.example.data.local.db.daos

import androidx.room.*
import com.example.data.model.UserDto
import com.example.domain.either.Either
import kotlinx.coroutines.flow.Flow

@Dao
interface UserDao {

    @Query("SELECT * FROM userdto")
    suspend fun getUsers(): Flow<Either<String,List<UserDto>>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertUser(userDto: UserDto)

    @Delete
    suspend fun deleteUsers(userDto: UserDto)

    @Update
    suspend fun updateUsers(userDto: UserDto)
}