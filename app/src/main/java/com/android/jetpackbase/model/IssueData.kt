package com.android.jetpackbase.model

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import com.android.jetpackbase.database.converter.AddressInfoConverter
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity
data class IssueData(
    @PrimaryKey(autoGenerate = true) val id: Long,
    @ColumnInfo(name = "issue_ame") val issueName: String,
    @ColumnInfo(name = "vehicle_no") val vehicleNo: String,
    @ColumnInfo(name = "date") val date: String,
    @ColumnInfo(name = "description") val description: String,
    @TypeConverters(AddressInfoConverter::class)
    @ColumnInfo(name = "address_info") val addressInfo: AddressInfo
) : Parcelable
