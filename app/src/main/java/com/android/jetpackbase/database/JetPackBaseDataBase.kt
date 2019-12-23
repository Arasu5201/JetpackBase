package com.android.jetpackbase.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.android.jetpackbase.database.converter.AddressInfoConverter
import com.android.jetpackbase.database.dao.IssueDao
import com.android.jetpackbase.model.IssueData

@Database(entities = [IssueData::class], version = 1)
@TypeConverters(AddressInfoConverter::class)
abstract class JetPackBaseDataBase : RoomDatabase() {
    abstract fun issueDao(): IssueDao

    companion object {

        @Volatile
        private var INSTANCE: JetPackBaseDataBase? = null

        fun init(context: Context) {
            INSTANCE = createDatabase(context).also { INSTANCE = it }
        }

        fun getInstance(): JetPackBaseDataBase? {
            return INSTANCE
        }

        private fun createDatabase(context: Context) =
            Room.databaseBuilder(context.applicationContext, JetPackBaseDataBase::class.java, "JetPackBaseDataBase.db")
                .build()
    }
}