package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.DropletShare: ImageVector
    get() {
        if (_dropletShare != null) {
            return _dropletShare!!
        }
        _dropletShare = Builder(name = "DropletShare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.884f, 13.025f)
                arcToRelative(6.591f, 6.591f, 0.0f, false, false, -0.82f, -2.148f)
                lineToRelative(-4.89f, -7.26f)
                curveToRelative(-0.42f, -0.625f, -1.287f, -0.803f, -1.936f, -0.397f)
                arcToRelative(1.376f, 1.376f, 0.0f, false, false, -0.41f, 0.397f)
                lineToRelative(-4.893f, 7.26f)
                curveToRelative(-1.695f, 2.838f, -1.035f, 6.441f, 1.567f, 8.546f)
                arcToRelative(7.125f, 7.125f, 0.0f, false, false, 4.498f, 1.58f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 22.0f)
                lineToRelative(5.0f, -5.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 21.5f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(-4.5f)
            }
        }
        .build()
        return _dropletShare!!
    }

private var _dropletShare: ImageVector? = null
