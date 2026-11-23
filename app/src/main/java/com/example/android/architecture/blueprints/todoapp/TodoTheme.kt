package com.example.android.architecture.blueprints.todoapp

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

// Tema visual personalizado de la ToDoApp - Rodrigo Hurtado TI4F
@Composable
fun TodoTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = lightColorScheme(
            primary = Color(0xFF5E35B1),            // Morado principal (barras, botones)
            onPrimary = Color.White,
            primaryContainer = Color(0xFFEDE7F6),   // Morado clarito (fondos suaves)
            onPrimaryContainer = Color(0xFF311B92),
            secondary = Color(0xFFFF7043),          // Naranja de acento (checkbox)
            tertiary = Color(0xFFD1C4E9),
            background = Color(0xFFFAF8FF),
            surface = Color(0xFFFAF8FF),
        )
    ) {
        content()
    }
}
