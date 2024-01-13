package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.HelpTriangleFilled: ImageVector
    get() {
        if (_helpTriangleFilled != null) {
            return _helpTriangleFilled!!
        }
        _helpTriangleFilled = Builder(name = "HelpTriangleFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 1.67f)
                curveToRelative(0.955f, 0.0f, 1.845f, 0.467f, 2.39f, 1.247f)
                lineToRelative(0.105f, 0.16f)
                lineToRelative(8.114f, 13.548f)
                arcToRelative(2.914f, 2.914f, 0.0f, false, true, -2.307f, 4.363f)
                lineToRelative(-0.195f, 0.008f)
                horizontalLineToRelative(-16.225f)
                arcToRelative(2.914f, 2.914f, 0.0f, false, true, -2.582f, -4.2f)
                lineToRelative(0.099f, -0.185f)
                lineToRelative(8.11f, -13.538f)
                arcToRelative(2.914f, 2.914f, 0.0f, false, true, 2.491f, -1.403f)
                close()
                moveTo(12.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.993f, 0.883f)
                lineToRelative(-0.007f, 0.117f)
                lineToRelative(0.007f, 0.127f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.986f, 0.0f)
                lineToRelative(0.007f, -0.117f)
                lineToRelative(-0.007f, -0.127f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.993f, -0.883f)
                close()
                moveTo(13.368f, 8.327f)
                arcToRelative(2.98f, 2.98f, 0.0f, false, false, -3.631f, 0.728f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.44f, 1.383f)
                lineToRelative(0.171f, -0.18f)
                arcToRelative(0.98f, 0.98f, 0.0f, false, true, 1.11f, -0.15f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.34f, 1.886f)
                lineToRelative(-0.232f, 0.012f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.111f, 1.994f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 1.371f, -5.673f)
                close()
            }
        }
        .build()
        return _helpTriangleFilled!!
    }

private var _helpTriangleFilled: ImageVector? = null
