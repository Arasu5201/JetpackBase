package com.android.jetpackbase.base

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.lifecycle.ViewModel


abstract class BaseViewModel : ViewModel() {

    // open var database: AppDatabase? = null
    @SuppressLint("StaticFieldLeak")
    open lateinit var mContext: Context
    /*  open var sharedPreferences: SharedPrefManager? = null
      open var basicEventLiveData = MutableLiveData<Int>()*/


    // Is it have lifecycle behaviour

    abstract fun onCreate(bundle: Bundle?)

    open fun onPause() {}

    open fun onResume() {}

    open fun startActivityForResult(requestCode: Int, resultCode: Int, data: Intent?) {}

    fun initContext(applicationContext: Context?) {
        // sharedPreferences= SharedPrefManager(applicationContext!!)
        //  database = AppDatabase.getInstance(applicationContext)
        mContext = applicationContext!!

    }

}