package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.VectorAsset
import androidx.compose.ui.graphics.vector.VectorAssetBuilder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.Moon: VectorAsset
    get() {
        if (_moon != null) {
            return _moon!!
        }
        _moon = VectorAssetBuilder(name = "Moon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                curveToRelative(0.132f, 0.0f, 0.263f, 0.0f, 0.393f, 0.0f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, false, 7.92f, 12.446f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, true, -8.313f, -12.454f)
                close()
            }
        }
        .build()
        return _moon!!
    }

private var _moon: VectorAsset? = null
