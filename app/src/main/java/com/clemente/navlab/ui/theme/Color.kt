package com.clemente.navlab.ui.theme

import androidx.compose.ui.graphics.Color

/**
 * Paleta de colores de la aplicación académica.
 * Identidad visual: morado / lavanda sobre fondos claros.
 */
object AppColors {
    // Morados
    val PrimaryPurple = Color(0xFF6650A4)      // Morado principal
    val PrimaryDarkPurple = Color(0xFF4F378B)  // Morado oscuro
    val WarmPurple = Color(0xFF8E6EC7)         // Morado cálido (degradado)

    // Lavanda
    val Lavender = Color(0xFFE9DFFF)           // Lavanda
    val LightLavender = Color(0xFFF8F3FF)      // Lavanda muy claro
    val BackgroundLavender = Color(0xFFFAF7FF) // Fondo principal

    // Superficies y texto
    val CardWhite = Color(0xFFFFFFFF)          // Blanco para tarjetas
    val TextPrimary = Color(0xFF2B2633)        // Texto principal
    val TextSecondary = Color(0xFF6F6878)      // Texto secundario
    val OutlineLight = Color(0xFFE4DEEE)       // Bordes suaves

    // Acciones peligrosas (cerrar sesión)
    val SoftRed = Color(0xFFB3261E)            // Rojo suave
    val SoftRedContainer = Color(0xFFF9DEDC)   // Contenedor rojo claro
    val SoftRedBackground = Color(0xFFFDECEA)  // Fondo rojo muy claro

    // Tema oscuro
    val DarkBackground = Color(0xFF1C1B1F)
    val DarkSurface = Color(0xFF2B2930)
    val DarkTextPrimary = Color(0xFFE6E1E5)
    val DarkTextSecondary = Color(0xFFCBC7CF)
    val DarkErrorContainer = Color(0xFF93000A)
    val DarkOnErrorContainer = Color(0xFFFFDAD6)
}