/*
 * Copyright 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * ============================================
 *  ToDoApp - U4RA7 | UTTN TI4F
 *  Desarrollador: Hurtado Perez Rodrigo Daniel
 *  Archivo: LocalTask.kt
 *  Descripción: [ROOM - ENTIDAD] Define la tabla "task" de la
 *  base de datos local. Cada objeto LocalTask es una fila.
 * ============================================
 */

package com.example.android.architecture.blueprints.todoapp.data.source.local

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Internal model used to represent a task stored locally in a Room database. This is used inside
 * the data layer only.
 *
 * See ModelMappingExt.kt for mapping functions used to convert this model to other
 * models.
 */

// @Entity convierte esta clase en una tabla de Room llamada "task"
@Entity(
    tableName = "task"
)
data class LocalTask(
    // Llave primaria: identificador único de cada tarea
    @PrimaryKey val id: String,
    // Columnas de la tabla: título, descripción y estado
    var title: String,
    var description: String,
    var isCompleted: Boolean,
)
