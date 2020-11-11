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

public val TablerIcons.JumpRope: VectorAsset
    get() {
        if (_jumpRope != null) {
            return _jumpRope!!
        }
        _jumpRope = VectorAssetBuilder(name = "JumpRope", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 14.0f)
                verticalLineToRelative(-6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 6.0f, 0.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 6.0f, 0.0f)
                verticalLineToRelative(-6.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 3.0f)
                lineTo(18.0f, 3.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 20.0f, 5.0f)
                lineTo(20.0f, 8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 18.0f, 10.0f)
                lineTo(18.0f, 10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 16.0f, 8.0f)
                lineTo(16.0f, 5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 18.0f, 3.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 14.0f)
                lineTo(6.0f, 14.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 8.0f, 16.0f)
                lineTo(8.0f, 19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 6.0f, 21.0f)
                lineTo(6.0f, 21.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.0f, 19.0f)
                lineTo(4.0f, 16.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 6.0f, 14.0f)
                close()
            }
        }
        .build()
        return _jumpRope!!
    }

private var _jumpRope: VectorAsset? = null
