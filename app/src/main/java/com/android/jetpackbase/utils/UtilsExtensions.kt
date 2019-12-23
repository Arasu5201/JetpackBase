package com.android.jetpackbase.utils

import android.content.Context
import android.net.ConnectivityManager
import android.os.Bundle
import android.os.Parcelable
import android.view.View
import com.squareup.moshi.Moshi


fun View.updateViewVisibility(isVisible: Boolean) {
    visibility = if (isVisible) View.VISIBLE else View.GONE
}

fun getBundleParcelableData(key: String, obj: Parcelable?): Bundle {
    val bundle = Bundle()
    bundle.putParcelable(key, obj)
    return bundle
}

fun isNetworkActive(context: Context?): Boolean {
    if (context == null) {
        return false
    }
    val connectivityManager =
        context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
    val activeNetwork = connectivityManager.activeNetworkInfo
    return activeNetwork != null && activeNetwork.isConnectedOrConnecting
}

fun <T> T.moshiObjToString(type: Class<T>): String {
    val moshi = Moshi.Builder().build()
    val jsonAdapter = moshi.adapter(type)
    return jsonAdapter.toJson(this)
}

fun <T> String.moshiStringToObj(type: Class<T>): T? {
    val moshi = Moshi.Builder().build()
    val jsonAdapter = moshi.adapter(type)
    return jsonAdapter.fromJson(this)
}


/*
@BindingAdapter("android:visibility")
fun setVisibility(view: View) {
    view.visibility = if (view.visibility == View.VISIBLE) View.GONE else View.VISIBLE
}
*/


