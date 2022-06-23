package com.example.roomts.di

import android.content.Context
import com.example.data.local.db.AppDataBase
import com.example.data.local.db.RoomClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppDataBaseModule {

    @Singleton
    @Provides
    fun provideAppDatabase(@ApplicationContext context: Context) =
        RoomClient().provideCreateAppDataBase(context)

    @Singleton
    @Provides
    fun provideUserDao(appDataBase: AppDataBase) =
        RoomClient().provideUserDao(appDataBase)

}