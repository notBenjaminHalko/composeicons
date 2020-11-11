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

public val TablerIcons.Omega: VectorAsset
    get() {
        if (_omega != null) {
            return _omega!!
        }
        _omega = VectorAssetBuilder(name = "Omega", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 19.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-1.0f)
                arcToRelative(7.35f, 7.35f, 0.0f, true, true, 6.0f, 0.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(5.0f)
            }
        }
        .build()
        return _omega!!
    }

private var _omega: VectorAsset? = null
