package com.android.jetpackbase.webservice

import com.android.jetpackbase.webservice.dto.response.IssueListResponse
import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.GET


interface ApiInterface {

    @GET("/getIssueList")
    fun getIssueList(): Deferred<Response<IssueListResponse>>
}