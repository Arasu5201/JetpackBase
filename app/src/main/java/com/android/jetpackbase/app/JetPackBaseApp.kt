package com.android.jetpackbase.app

import android.app.Application
import com.android.jetpackbase.BuildConfig
import com.android.jetpackbase.database.JetPackBaseDataBase
import com.android.jetpackbase.utils.CodeSnippetExtension
import com.android.jetpackbase.webservice.base.RetrofitModules
import timber.log.Timber

class JetPackBaseApp : Application() {

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
        CodeSnippetExtension.init(applicationContext)
        JetPackBaseDataBase.init(applicationContext)
        RetrofitModules.init(applicationContext)
    }
}
