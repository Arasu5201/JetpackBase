package com.android.jetpackbase.features.helpfaq

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import com.android.jetpackbase.base.BaseViewModel
import com.android.jetpackbase.common.getHelpFaqList
import com.android.jetpackbase.model.HelpFaqData

class HelpAndFaqViewModel : BaseViewModel()
{
    val helpFaqList = MutableLiveData<MutableList<HelpFaqData>>()

    override fun onCreate(bundle: Bundle?) {
        helpFaqList.postValue(getHelpFaqList())
    }

}