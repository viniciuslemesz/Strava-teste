package com.example.testeaula.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val OrangeColor = Color(0xFFFF6F00) // Laranja Strava

private val LightColors = lightColorScheme(
    primary = OrangeColor,
    secondary = Color(0xFFFFAB40),
    tertiary = Color(0xFFFFD180),
    background = Color(0xFFFDFDFD)
)

@Composable
fun TesteaulaTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = LightColors,
        typography = MaterialTheme.typography,
        content = content
    )
}