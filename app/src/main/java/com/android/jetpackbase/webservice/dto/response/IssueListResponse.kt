package com.android.jetpackbase.webservice.dto.response

import com.android.jetpackbase.model.IssueData

data class IssueListResponse(val data : MutableList<IssueData>) : BaseResponse()
