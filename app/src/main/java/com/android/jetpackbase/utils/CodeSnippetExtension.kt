package com.android.jetpackbase.utils

import android.content.Context
import android.net.ConnectivityManager

class CodeSnippetExtension private constructor() {

    companion object {
        private var appContext: Context? = null
        @Volatile
        private var INSTANCE: CodeSnippetExtension? = null

        fun init(context: Context) {
            appContext = context
        }

        fun getInstance(): CodeSnippetExtension =
            INSTANCE ?: synchronized(this) {
                INSTANCE ?: CodeSnippetExtension().also { INSTANCE = it }
            }

    }

    fun isNetworkActive(): Boolean {
        if (appContext == null) {
            return false
        }
        val connectivityManager = appContext?.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val activeNetwork = connectivityManager.activeNetworkInfo
        return activeNetwork != null && activeNetwork.isConnectedOrConnecting
    }

}