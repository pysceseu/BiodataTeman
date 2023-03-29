package com.zubet.recyclerviewgita

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class friendClass(
    val imgFriend: Int,
    val nameFriend: String,
    val alamatFriend: String,
    val ttlFriend: String,
    val hobiFriend: String
): Parcelable
