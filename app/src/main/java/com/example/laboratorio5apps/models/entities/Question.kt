package com.example.laboratorio5apps.models.entities

/*
 * Copyright 2018, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(tableName = "question_table",
    indices = arrayOf(Index(value = arrayOf("question_id"), unique = true)))
data class Question (
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "question_id")
    var id: Long = 0L,
    @ColumnInfo(name = "question")
    var question: String,
    @ColumnInfo(name = "type")
    /*
    * Tipos de pregunta
    * 1: texto
    * 2: numero
    * 3: rating
    * */
    var type: Int,
    @ColumnInfo(name = "is_default")
    var isDefault: Boolean = false
)