package com.android.jetpackbase.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class AddressInfo(val address : String, val lat : String, val lng : String) : Parcelable