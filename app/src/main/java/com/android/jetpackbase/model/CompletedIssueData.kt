package com.android.jetpackbase.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class CompletedIssueData(val issueName : String, val vehicleNo : String, val date : String, val notes : String, val description : String, val addressInfo: AddressInfo) : Parcelable