package com.example.data.local.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.data.local.db.daos.UserDao
import com.example.data.model.UserDto

@Database(entities = [UserDto::class], version = 1)
abstract class AppDataBase : RoomDatabase() {
    abstract fun messDao(): UserDao
}