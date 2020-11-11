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

public val TablerIcons.Tank: VectorAsset
    get() {
        if (_tank != null) {
            return _tank!!
        }
        _tank = VectorAssetBuilder(name = "Tank", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 12.0f)
                lineTo(17.0f, 12.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 20.0f, 15.0f)
                lineTo(20.0f, 15.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 17.0f, 18.0f)
                lineTo(5.0f, 18.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 2.0f, 15.0f)
                lineTo(2.0f, 15.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 5.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 12.0f)
                lineToRelative(1.0f, -5.0f)
                horizontalLineToRelative(5.0f)
                lineToRelative(3.0f, 5.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 9.0f)
                lineTo(13.2f, 9.0f)
            }
        }
        .build()
        return _tank!!
    }

private var _tank: VectorAsset? = null
