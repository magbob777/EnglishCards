package com.example.englishcards

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(tableName = "en_words",indices = [Index(value = ["word"],unique = true)])
data class EnglishWords (
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    @ColumnInfo(name = "word")
    val word: String,
    )

@Entity(tableName = "ru_words",indices = [Index(value = ["word"],unique = true)])
data class RussianWords (
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    @ColumnInfo(name = "word")
    val word: String,
)

@Entity(tableName = "en_ru_maps",primaryKeys = ["idRu","idEn"])
data class EnRuMap (
    val idRu: Long,
    val idEn: Long,
)
