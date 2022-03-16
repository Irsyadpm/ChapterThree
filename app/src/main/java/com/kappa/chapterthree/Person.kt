package com.kappa.chapterthree

import android.os.Parcel
import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.io.Serializable

data class Person (
    val name: String,
    val email: String,
    val address: String,
    val age: String
): Serializable

@Parcelize
data class PersonParcelable (
    val name: String,
    val email: String,
    val address: String,
    val age: String
): Parcelable
//{
//    constructor(parcel: Parcel) : this(
//        parcel.readString(),
//        parcel.readString(),
//        parcel.readString(),
//        parcel.readString()
//    ) {
//    }
//
//    override fun writeToParcel(parcel: Parcel, flags: Int) {
//        parcel.writeString(name)
//        parcel.writeString(email)
//        parcel.writeString(address)
//        parcel.writeString(age)
//    }
//
//    override fun describeContents(): Int {
//        return 0
//    }
//
//    companion object CREATOR : Parcelable.Creator<PersonParcelable> {
//        override fun createFromParcel(parcel: Parcel): PersonParcelable {
//            return PersonParcelable(parcel)
//        }
//
//        override fun newArray(size: Int): Array<PersonParcelable?> {
//            return arrayOfNulls(size)
//        }
//    }
//}