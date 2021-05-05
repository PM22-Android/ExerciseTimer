package com.ht.exceciseinternal.beans

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.ht.exceciseinternal.utility.uniqueId
import kotlinx.android.parcel.Parcelize

@Entity(tableName = "exercise_table")
@Parcelize
data class Circuit(
    @PrimaryKey(autoGenerate = false) val circuitId: Long = uniqueId,
    var name: String? = null,
    val noOfRounds: Int = 1,
    var exerciseList: MutableList<Exercise>? = null
): Parcelable

@Parcelize
data class Exercise(
    val exerciseId: Long = uniqueId,
    var name: String? = null,
    var exerciseDuration: Duration = Duration(),
    var restDuration: Duration = Duration()
): Parcelable

@Parcelize
data class Duration(
    var min: Long? = null,
    var sec: Long? = null
): Parcelable