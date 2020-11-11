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

public val TablerIcons.Alien: VectorAsset
    get() {
        if (_alien != null) {
            return _alien!!
        }
        _alien = VectorAssetBuilder(name = "Alien", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.0f, 17.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 2.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                curveToRelative(-4.664f, 0.0f, -7.396f, 2.331f, -7.862f, 5.595f)
                arcToRelative(11.816f, 11.816f, 0.0f, false, false, 2.0f, 8.592f)
                arcToRelative(10.777f, 10.777f, 0.0f, false, false, 3.199f, 3.064f)
                curveToRelative(1.666f, 1.0f, 3.664f, 1.0f, 5.33f, 0.0f)
                arcToRelative(10.777f, 10.777f, 0.0f, false, false, 3.199f, -3.064f)
                arcToRelative(11.89f, 11.89f, 0.0f, false, false, 2.0f, -8.592f)
                curveToRelative(-0.466f, -3.265f, -3.198f, -5.595f, -7.862f, -5.595f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 11.0f)
                lineTo(10.0f, 13.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 11.0f)
                lineTo(14.0f, 13.0f)
            }
        }
        .build()
        return _alien!!
    }

private var _alien: VectorAsset? = null
