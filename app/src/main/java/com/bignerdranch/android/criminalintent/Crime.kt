package com.bignerdranch.android.criminalintent

import androidx.room.Entity
import java.util.*
import androidx.room.PrimaryKey;
import java.util.Date
import java.util.UUID
@Entity
data class Crime(
    @PrimaryKey val id: UUID = UUID.randomUUID(),
    var title: String = "",
    var date: Date = Date(),
    var isSolved: Boolean = false,
    var suspect: String = "")
{
    val photoFileName
    get() = "IMG_$id.jpg"

}