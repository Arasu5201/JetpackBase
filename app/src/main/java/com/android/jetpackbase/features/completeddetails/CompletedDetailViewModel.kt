package com.android.jetpackbase.features.completeddetails

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import com.android.jetpackbase.base.BaseViewModel
import com.android.jetpackbase.common.Constants
import com.android.jetpackbase.model.CompletedIssueData

class CompletedDetailViewModel : BaseViewModel()
{
    val completedIssueLiveData : MutableLiveData<CompletedIssueData> by lazy { MutableLiveData<CompletedIssueData>() }
    override fun onCreate(bundle: Bundle?) {
        bundle?.getParcelable<CompletedIssueData>(Constants.BUNDLE_COMPLETED_ISSUE_DATA).let{
            completedIssueLiveData.postValue(it)
        }
    }

}