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

public val TablerIcons.FolderHeart: ImageVector
    get() {
        if (_folderHeart != null) {
            return _folderHeart!!
        }
        _folderHeart = Builder(name = "FolderHeart", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.5f, 19.0f)
                horizontalLineToRelative(-5.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineToRelative(-11.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(4.0f)
                lineToRelative(3.0f, 3.0f)
                horizontalLineToRelative(7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 22.0f)
                lineToRelative(3.35f, -3.284f)
                arcToRelative(2.143f, 2.143f, 0.0f, false, false, 0.005f, -3.071f)
                arcToRelative(2.242f, 2.242f, 0.0f, false, false, -3.129f, -0.006f)
                lineToRelative(-0.224f, 0.22f)
                lineToRelative(-0.223f, -0.22f)
                arcToRelative(2.242f, 2.242f, 0.0f, false, false, -3.128f, -0.006f)
                arcToRelative(2.143f, 2.143f, 0.0f, false, false, -0.006f, 3.071f)
                lineToRelative(3.355f, 3.296f)
                close()
            }
        }
        .build()
        return _folderHeart!!
    }

private var _folderHeart: ImageVector? = null
