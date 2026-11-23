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
 *  Desarrolladores: Hurtado Perez Rodrigo Daniel
 *                   Perez Flores Zayda Yareth
 *  Archivo: TodoActivity.kt
 *  Descripción: Actividad principal y punto de entrada
 *  de la app. Carga el tema visual (TodoTheme) y el
 *  grafo de navegación entre pantallas (TodoNavGraph).
 * ============================================
 */

package com.example.android.architecture.blueprints.todoapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import dagger.hilt.android.AndroidEntryPoint

/**
 * Main activity for the todoapp
 */
@AndroidEntryPoint // Permite que Hilt inyecte dependencias en esta Activity
class TodoActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge() // La UI ocupa toda la pantalla
        setContent {
            TodoTheme {          // Aplica los colores personalizados
                TodoNavGraph()   // Controla la navegación entre pantallas
            }
        }
    }
}
