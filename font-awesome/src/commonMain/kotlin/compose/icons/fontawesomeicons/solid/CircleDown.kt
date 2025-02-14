package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.CircleDown: ImageVector
    get() {
        if (_circleDown != null) {
            return _circleDown!!
        }
        _circleDown = Builder(name = "CircleDown", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, false, 0.0f, 512.0f)
                arcTo(256.0f, 256.0f, 0.0f, true, false, 256.0f, 0.0f)
                close()
                moveTo(376.9f, 294.6f)
                lineTo(269.8f, 394.5f)
                curveToRelative(-3.8f, 3.5f, -8.7f, 5.5f, -13.8f, 5.5f)
                reflectiveCurveToRelative(-10.1f, -2.0f, -13.8f, -5.5f)
                lineTo(135.1f, 294.6f)
                curveToRelative(-4.5f, -4.2f, -7.1f, -10.1f, -7.1f, -16.3f)
                curveToRelative(0.0f, -12.3f, 10.0f, -22.3f, 22.3f, -22.3f)
                lineToRelative(57.7f, 0.0f)
                lineToRelative(0.0f, -96.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                lineToRelative(32.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                lineToRelative(0.0f, 96.0f)
                lineToRelative(57.7f, 0.0f)
                curveToRelative(12.3f, 0.0f, 22.3f, 10.0f, 22.3f, 22.3f)
                curveToRelative(0.0f, 6.2f, -2.6f, 12.1f, -7.1f, 16.3f)
                close()
            }
        }
        .build()
        return _circleDown!!
    }

private var _circleDown: ImageVector? = null
