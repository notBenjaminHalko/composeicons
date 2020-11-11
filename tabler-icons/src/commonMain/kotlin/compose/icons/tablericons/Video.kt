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

public val TablerIcons.Video: VectorAsset
    get() {
        if (_video != null) {
            return _video!!
        }
        _video = VectorAssetBuilder(name = "Video", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 10.0f)
                lineToRelative(4.553f, -2.276f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.447f, 0.894f)
                verticalLineToRelative(6.764f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.447f, 0.894f)
                lineToRelative(-4.553f, -2.276f)
                verticalLineToRelative(-4.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 6.0f)
                lineTo(13.0f, 6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 15.0f, 8.0f)
                lineTo(15.0f, 16.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 13.0f, 18.0f)
                lineTo(5.0f, 18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 3.0f, 16.0f)
                lineTo(3.0f, 8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 5.0f, 6.0f)
                close()
            }
        }
        .build()
        return _video!!
    }

private var _video: VectorAsset? = null
