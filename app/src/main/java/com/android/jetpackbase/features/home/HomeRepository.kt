package com.android.jetpackbase.features.home

import androidx.lifecycle.LiveData
import com.android.jetpackbase.database.JetPackBaseDataBase
import com.android.jetpackbase.database.dao.IssueDao
import com.android.jetpackbase.model.AddressInfo
import com.android.jetpackbase.model.IssueData
import com.android.jetpackbase.utils.CodeSnippetExtension
import com.android.jetpackbase.webservice.IssueListRepoApi
import com.android.jetpackbase.webservice.base.NetworkResult
import kotlinx.coroutines.*
import timber.log.Timber

class HomeRepository(codeSnippet: CodeSnippetExtension) {
    private val codeSnippetExt: CodeSnippetExtension = codeSnippet
    private val issueListRepoApi: IssueListRepoApi by lazy { IssueListRepoApi() } // what is the use of lazy
    private var issueDao: IssueDao? = null
    private val uiDispatcher: CoroutineDispatcher = Dispatchers.IO // why we need to create instance

    private suspend fun getIssueList() = GlobalScope.launch(uiDispatcher)
    {
        async {
            if (codeSnippetExt.isNetworkActive()) {
                when (issueListRepoApi.getIssueList()) {
                    is NetworkResult.Successful -> {
//                           val data = (result.value as IssueListResponse).data
                        // issueDao?.insertAllIssue(data)
                        Timber.d("======> insertAllIssue")
                        val issueData = IssueData(
                            System.currentTimeMillis(),
                            "Test",
                            "TN 05 AB 7534",
                            "25th May",
                            "dsfsd",
                            AddressInfo("sdadasdsa", "", "")
                        )
                        issueDao?.insertIssue(issueData)
                    }
                    else -> {
                        throw Exception("Error Failed")
                    }
                }
            }
        }
    }

    suspend fun getIssues(): LiveData<MutableList<IssueData>>? {
        getIssueList()
        issueDao = JetPackBaseDataBase.getInstance()?.issueDao()
        return issueDao?.getIssueList()
    }

    /*suspend fun insertIssue(issueData: IssueData) {
        issueDao?.insertIssue(issueData)
    }

    fun getIssueData(): MutableList<IssueData>? {
        issueDao = JetPackBaseDataBase.getInstance()?.issueDao()
        return issueDao?.getIssues()
    }
*/

}