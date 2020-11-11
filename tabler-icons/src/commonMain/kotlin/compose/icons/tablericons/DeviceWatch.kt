package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.VectorAsset
import androidx.compose.ui.graphics.vector.VectorAssetBuilder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.DeviceWatch: VectorAsset
    get() {
        if (_deviceWatch != null) {
            return _deviceWatch!!
        }
        _deviceWatch = VectorAssetBuilder(name = "DeviceWatch", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 6.0f)
                lineTo(15.0f, 6.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 18.0f, 9.0f)
                lineTo(18.0f, 15.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 15.0f, 18.0f)
                lineTo(9.0f, 18.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 6.0f, 15.0f)
                lineTo(6.0f, 9.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 9.0f, 6.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 18.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-3.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 6.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(3.0f)
            }
        }
        .build()
        return _deviceWatch!!
    }

private var _deviceWatch: VectorAsset? = null
