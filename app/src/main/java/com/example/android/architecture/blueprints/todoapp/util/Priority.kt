/**
 * ============================================
 *  ToDoApp - U4RA7 | UTTN TI4F
 *  Equipo: Hurtado Perez Rodrigo Daniel
 *          Perez Flores Zayda Yareth
 *  Archivo: Priority.kt
 *  Descripción: [INNOVACIÓN] Niveles de prioridad de las tareas
 *  (baja, media, alta), su color y su texto. El valor se guarda
 *  en la columna "priority" de la tabla "task" en Room.
 * ============================================
 */

package com.example.android.architecture.blueprints.todoapp.util

import androidx.annotation.StringRes
import androidx.compose.ui.graphics.Color
import com.example.android.architecture.blueprints.todoapp.R

// Valores que se guardan en la base de datos
const val PRIORITY_LOW = 0
const val PRIORITY_MEDIUM = 1
const val PRIORITY_HIGH = 2

// Lista de niveles para mostrar los botones de selección
val PRIORITY_LEVELS = listOf(PRIORITY_LOW, PRIORITY_MEDIUM, PRIORITY_HIGH)

// Color de cada prioridad
fun priorityColor(priority: Int): Color = when (priority) {
    PRIORITY_HIGH -> Color(0xFFE53935) // Rojo
    PRIORITY_LOW -> Color(0xFF43A047)  // Verde
    else -> Color(0xFFFFA000)          // Ámbar (media)
}

// Texto de cada prioridad
@StringRes
fun priorityLabel(priority: Int): Int = when (priority) {
    PRIORITY_HIGH -> R.string.priority_high
    PRIORITY_LOW -> R.string.priority_low
    else -> R.string.priority_medium
}
