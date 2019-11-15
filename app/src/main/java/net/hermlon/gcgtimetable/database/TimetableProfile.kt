package net.hermlon.gcgtimetable.database

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.Relation

@Entity
data class TimetableProfile(

    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    val profileName: String = "",
    val sourceId: Long = 0L
)

/*
class TimetableProfileAll(
    @Embedded
    val timetableProfile: TimetableProfile,
    @Relation(parentColumn = "id", entityColumn = "profileId", entity = TimetableTimetable::class)
    val timetables: List<TimetableTimetable> = listOf()
)*/