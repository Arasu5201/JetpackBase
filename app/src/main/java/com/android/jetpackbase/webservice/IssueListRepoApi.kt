package com.android.jetpackbase.webservice

import com.android.jetpackbase.webservice.base.NetworkResult
import com.android.jetpackbase.webservice.base.RetrofitModules
import com.android.jetpackbase.webservice.base.awaitResult


class IssueListRepoApi
{
    suspend fun getIssueList(): NetworkResult<Any> {
        val apiService = RetrofitModules.getRetrofitBuilder().create(ApiInterface::class.java)
        return apiService.getIssueList().awaitResult()
    }
}