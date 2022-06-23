package com.example.data.local.db

import android.content.Context
import androidx.room.Room
import com.example.data.local.db.daos.UserDao

class RoomClient {
    fun provideCreateAppDataBase(context: Context) = Room.databaseBuilder(
        context,
        AppDataBase::class.java,
        "geekmessenger_database"
    ).fallbackToDestructiveMigration()
        .build()

    fun provideUserDao(userDataBase: AppDataBase): UserDao = userDataBase.userDao()

}