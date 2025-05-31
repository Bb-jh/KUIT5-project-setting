package com.konkuk.kuitprojectsetting.core.util.context

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.core.graphics.ColorUtils

fun Color.adjustLightness(factor: Float): Color {
    val argb = this.toArgb()
    val hsl = FloatArray(3)
    ColorUtils.colorToHSL(argb, hsl)  //hsl로 변환. hsl[2]가 명도
    hsl[2] = (hsl[2] * factor).coerceIn(0f, 1f)
    val newArgb = ColorUtils.HSLToColor(hsl)
    return Color(newArgb)
}