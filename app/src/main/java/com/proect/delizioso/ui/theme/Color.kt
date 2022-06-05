package com.proect.delizioso.ui.theme

import androidx.compose.ui.graphics.Color

data class Colors(
    val primaryBackground: Color,
    val secondaryBackground: Color,
    val headerTextColor: Color,
    val primaryTextColor: Color,
    val primaryTextInvertColor: Color,
    val primaryTintColor: Color,
    val secondaryTintColor: Color,
    val hintTextColor: Color,
    val accentColor: Color,
    val notificationColor: Color,
    val actionTextColor: Color,
)

val lightPallette = Colors(
    primaryBackground = Color.White,
    secondaryBackground = Color(0xFFD0CCC7),
    headerTextColor = Color(0xFF311F09),
    primaryTextColor = Color(0xFF59442B),
    primaryTextInvertColor = Color(0xFFFFFFFF),
    primaryTintColor = Color(0xFFFF8A00),
    hintTextColor = Color(0xFFA0978C),
    accentColor = Color(0xFF8AEAFF),
    notificationColor = Color(0xFFFF3838),
    secondaryTintColor = Color(0xFF3FA72F),
    actionTextColor = Color(0xFF0094FF)
)