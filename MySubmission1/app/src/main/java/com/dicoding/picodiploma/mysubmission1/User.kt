package com.dicoding.picodiploma.mysubmission1

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class User(
    val username: String,
    val name: String,
    val avatar: Int,
    val location: String,
    val repository: String,
    val company: String,
    val followers: String,
    val following: String

) : Parcelable
