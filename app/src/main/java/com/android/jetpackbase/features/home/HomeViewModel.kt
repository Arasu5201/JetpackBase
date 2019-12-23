package com.android.jetpackbase.features.home

import android.os.Bundle
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.android.jetpackbase.base.BaseViewModel
import com.android.jetpackbase.model.IssueData
import com.android.jetpackbase.utils.CodeSnippetExtension
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import timber.log.Timber

class HomeViewModel : BaseViewModel() {
    var issueList: LiveData<MutableList<IssueData>>? = MutableLiveData()
    private val homeRepository: HomeRepository by lazy { HomeRepository(CodeSnippetExtension.getInstance()) }
    override fun onCreate(bundle: Bundle?) {
        viewModelScope.launch(Dispatchers.IO) {
            runCatching {
                issueList = homeRepository.getIssues()
                //    homeRepository.getIssueList()
            }.onSuccess { repo ->

            }.onFailure {
                Timber.d(it)
                it.printStackTrace()
            }
        }

    }

}