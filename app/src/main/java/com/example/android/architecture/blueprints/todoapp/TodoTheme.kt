/**
 * ============================================
 *  ToDoApp - U4RA7 | UTTN TI4F
 *  Desarrollador: Perez Florez Zayda Yareth
 *  Archivo: TodoTheme.kt
 *  Descripción: [UI - TEMA] Paleta de colores personalizada
 *  (morado y naranja) aplicada a toda la app.
 * ============================================
 */
package com.example.android.architecture.blueprints.todoapp

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

// Paleta clara (modo día) - colores personalizados de la ToDoApp
private val LightColors = lightColorScheme(
    primary = Color(0xFF5E35B1),            // Morado principal (barras, botones)
    onPrimary = Color.White,
    primaryContainer = Color(0xFFEDE7F6),   // Morado clarito (fondos suaves)
    onPrimaryContainer = Color(0xFF311B92),
    secondary = Color(0xFFFF7043),          // Naranja de acento (checkbox)
    tertiary = Color(0xFFD1C4E9),
    background = Color(0xFFFAF8FF),
    surface = Color(0xFFFAF8FF),
)

// [INNOVACIÓN] Paleta oscura (modo noche)
private val DarkColors = darkColorScheme(
    primary = Color(0xFF7E57C2),            // Morado un poco más claro para fondo oscuro
    onPrimary = Color.White,
    primaryContainer = Color(0xFF4527A0),
    onPrimaryContainer = Color(0xFFEDE7F6),
    secondary = Color(0xFFFF8A65),          // Naranja suave
    tertiary = Color(0xFF5E35B1),
    background = Color(0xFF121016),
    surface = Color(0xFF121016),
)

// Tema de la app: [INNOVACIÓN] usa la paleta oscura automáticamente
// cuando el celular está en modo oscuro
@Composable
fun TodoTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = if (darkTheme) DarkColors else LightColors
    ) {
        content()
    }
}
