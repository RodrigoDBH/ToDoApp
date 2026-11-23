/*
 * Copyright 2019 The Android Open Source Project
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
 *  Archivo: ToDoDatabase.kt
 *  Descripción: [ROOM - DATABASE] Clase principal de la base de
 *  datos local. Registra la tabla LocalTask y expone el TaskDao.
 * ============================================
 */

package com.example.android.architecture.blueprints.todoapp.data.source.local

import androidx.room.Database
import androidx.room.RoomDatabase

/**
 * The Room Database that contains the Task table.
 *
 * Note that exportSchema should be true in production databases.
 */

// Base de datos Room: tabla LocalTask, versión 1 del esquema
@Database(entities = [LocalTask::class], version = 1, exportSchema = false)
abstract class ToDoDatabase : RoomDatabase() {
    // Da acceso a las consultas definidas en TaskDao
    abstract fun taskDao(): TaskDao
}
