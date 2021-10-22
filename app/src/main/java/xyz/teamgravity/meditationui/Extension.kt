package xyz.teamgravity.meditationui

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Path
import xyz.teamgravity.meditationui.ui.theme.*
import kotlin.math.abs

fun Path.standardQuadFromTo(from: Offset, to: Offset) {
    quadraticBezierTo(
        from.x,
        from.y,
        abs(from.x + to.x) / 2f,
        abs(from.y + to.y) / 2f
    )
}

fun buildFeatures() = listOf(
    FeatureModel(
        title = "Sleep meditation",
        R.drawable.ic_headphone,
        BlueViolet1,
        BlueViolet2,
        BlueViolet3
    ),
    FeatureModel(
        title = "Tips for sleeping",
        R.drawable.ic_videocam,
        LightGreen1,
        LightGreen2,
        LightGreen3
    ),
    FeatureModel(
        title = "Night island",
        R.drawable.ic_headphone,
        OrangeYellow1,
        OrangeYellow2,
        OrangeYellow3
    ),
    FeatureModel(
        title = "Calming sounds",
        R.drawable.ic_headphone,
        Beige1,
        Beige2,
        Beige3
    )
)