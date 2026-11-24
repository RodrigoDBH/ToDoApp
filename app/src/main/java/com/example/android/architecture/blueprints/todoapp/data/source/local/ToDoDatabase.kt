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
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase

/**
 * The Room Database that contains the Task table.
 *
 * Note that exportSchema should be true in production databases.
 */

// Base de datos Room: tabla LocalTask, versión 2 del esquema
// [INNOVACIÓN] Versión 2: se agregó la columna "priority"
@Database(entities = [LocalTask::class], version = 2, exportSchema = false)
abstract class ToDoDatabase : RoomDatabase() {
    // Da acceso a las consultas definidas en TaskDao
    abstract fun taskDao(): TaskDao
}

// [INNOVACIÓN] Migración de la versión 1 a la 2: agrega la columna "priority"
// sin borrar las tareas que ya estaban guardadas en el teléfono
val MIGRATION_1_2 = object : Migration(1, 2) {
    override fun migrate(db: SupportSQLiteDatabase) {
        db.execSQL("ALTER TABLE task ADD COLUMN priority INTEGER NOT NULL DEFAULT 1")
    }
}
