package com.android.jetpackbase.database.converter

import androidx.room.TypeConverter
import com.android.jetpackbase.model.AddressInfo
import com.android.jetpackbase.utils.moshiObjToString
import com.android.jetpackbase.utils.moshiStringToObj

class AddressInfoConverter {
    companion object {}
    @TypeConverter
    fun fromString(value: String): AddressInfo? = value.moshiStringToObj(AddressInfo::class.java)

    @TypeConverter
    fun fromModel(value: AddressInfo): String = value.moshiObjToString(AddressInfo::class.java)
}