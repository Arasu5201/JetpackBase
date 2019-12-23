package com.android.jetpackbase.database.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.android.jetpackbase.model.IssueData

@Dao
interface IssueDao
{
    @Query("SELECT * FROM issuedata")
    fun  getIssueList(): LiveData<MutableList<IssueData>>

    @Query("SELECT * FROM issuedata")
    fun getIssues(): MutableList<IssueData>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertIssue(issueData: IssueData)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAllIssue(issueData: MutableList<IssueData>)
}