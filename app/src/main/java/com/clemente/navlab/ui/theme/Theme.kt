package com.clemente.navlab.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorScheme = darkColorScheme(
    primary = AppColors.Lavender,
    onPrimary = AppColors.PrimaryDarkPurple,
    primaryContainer = AppColors.PrimaryDarkPurple,
    onPrimaryContainer = AppColors.Lavender,
    secondary = AppColors.Lavender,
    onSecondary = AppColors.PrimaryDarkPurple,
    secondaryContainer = AppColors.DarkSurface,
    onSecondaryContainer = AppColors.Lavender,
    background = AppColors.DarkBackground,
    onBackground = AppColors.DarkTextPrimary,
    surface = AppColors.DarkSurface,
    onSurface = AppColors.DarkTextPrimary,
    surfaceVariant = AppColors.DarkSurface,
    onSurfaceVariant = AppColors.DarkTextSecondary,
    error = AppColors.SoftRed,
    onError = Color.White,
    errorContainer = AppColors.DarkErrorContainer,
    onErrorContainer = AppColors.DarkOnErrorContainer
)

private val LightColorScheme = lightColorScheme(
    primary = AppColors.PrimaryPurple,
    onPrimary = Color.White,
    primaryContainer = AppColors.Lavender,
    onPrimaryContainer = AppColors.PrimaryDarkPurple,
    secondary = AppColors.PrimaryDarkPurple,
    onSecondary = Color.White,
    secondaryContainer = AppColors.LightLavender,
    onSecondaryContainer = AppColors.TextPrimary,
    tertiary = AppColors.WarmPurple,
    onTertiary = Color.White,
    background = AppColors.BackgroundLavender,
    onBackground = AppColors.TextPrimary,
    surface = AppColors.CardWhite,
    onSurface = AppColors.TextPrimary,
    surfaceVariant = AppColors.LightLavender,
    onSurfaceVariant = AppColors.TextSecondary,
    error = AppColors.SoftRed,
    onError = Color.White,
    errorContainer = AppColors.SoftRedContainer,
    onErrorContainer = AppColors.SoftRed,
    outline = AppColors.OutlineLight,
    outlineVariant = AppColors.Lavender
)

@Composable
fun NavLabTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme,
        typography = Typography,
        content = content
    )
}