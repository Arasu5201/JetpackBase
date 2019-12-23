package com.android.jetpackbase.utils.sharepreference

import android.content.Context
import com.android.jetpackbase.common.Constants.PreferenceKey.Companion.TOKEN

class SharedPrefManager(context: Context) {
    var sharedPref: SharedPref = SharedPref(context)

    var token: String
        get() = sharedPref.getStringDefaultValue(TOKEN)
        set(token) = sharedPref.setSharedValue(TOKEN, token)

   /* var flowerInfo: FlowerInfo
        get() = sharedPref.getStringValue(FLOWER_INFO)!!.moshiStringToObj(FlowerInfo::class.java)!!
        set(value) = sharedPref.setSharedValue(FLOWER_INFO, value.moshiObjToString(FlowerInfo::class.java))*/

}