package com.android.jetpackbase.features.completedList

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import com.android.jetpackbase.base.BaseViewModel
import com.android.jetpackbase.common.updateCompletedIssueList
import com.android.jetpackbase.model.CompletedIssueData

class CompletedIssueViewModel : BaseViewModel() {
    val completedIssueList = MutableLiveData<MutableList<CompletedIssueData>>()

    override fun onCreate(bundle: Bundle?) {
        completedIssueList.postValue(updateCompletedIssueList())
    }


}