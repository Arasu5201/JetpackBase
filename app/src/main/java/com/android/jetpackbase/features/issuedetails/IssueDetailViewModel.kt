package com.android.jetpackbase.features.issuedetails

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import com.android.jetpackbase.base.BaseViewModel
import com.android.jetpackbase.common.Constants
import com.android.jetpackbase.model.IssueData

class IssueDetailViewModel : BaseViewModel()
{
    val issueDataLiveData : MutableLiveData<IssueData> by lazy { MutableLiveData<IssueData>() }
    override fun onCreate(bundle: Bundle?) {
        bundle?.getParcelable<IssueData>(Constants.BUNDLE_ISSUE_DATA).let{
            issueDataLiveData.postValue(it)
        }
    }


}