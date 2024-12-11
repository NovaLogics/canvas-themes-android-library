package novalogics.android.canvas_themes.material_style


import androidx.compose.material3.ColorScheme
import novalogics.android.canvas_themes.material_style.handler.ThemeManager

class MaterialCanvas {
    private val themeManager: ThemeManager = ThemeManager

    fun getOrangeBlazeLightColors(): ColorScheme = themeManager.OrangeBlazeLightColors
    fun getOrangeBlazeDarkColors(): ColorScheme = themeManager.OrangeBlazeDarkColors

    fun getOrangeLustreLightColors(): ColorScheme = themeManager.OrangeLustreLightColors
    fun getOrangeLustreDarkColors(): ColorScheme = themeManager.OrangeLustreDarkColors

    fun getBlackWhiteLightColors(): ColorScheme = themeManager.BlackWhiteLightColors
    fun getBlackWhiteDarkColors(): ColorScheme = themeManager.BlackWhiteDarkColors
}