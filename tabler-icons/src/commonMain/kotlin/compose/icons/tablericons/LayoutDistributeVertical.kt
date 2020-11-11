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

public val TablerIcons.LayoutDistributeVertical: VectorAsset
    get() {
        if (_layoutDistributeVertical != null) {
            return _layoutDistributeVertical!!
        }
        _layoutDistributeVertical = VectorAssetBuilder(name = "LayoutDistributeVertical",
                defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f,
                viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 4.0f)
                lineTo(4.0f, 20.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.0f, 4.0f)
                lineTo(20.0f, 20.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.0f, 6.0f)
                lineTo(13.0f, 6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 15.0f, 8.0f)
                lineTo(15.0f, 16.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 13.0f, 18.0f)
                lineTo(11.0f, 18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 9.0f, 16.0f)
                lineTo(9.0f, 8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 11.0f, 6.0f)
                close()
            }
        }
        .build()
        return _layoutDistributeVertical!!
    }

private var _layoutDistributeVertical: VectorAsset? = null
