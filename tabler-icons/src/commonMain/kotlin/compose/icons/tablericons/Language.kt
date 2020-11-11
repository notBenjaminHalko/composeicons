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

public val TablerIcons.Language: VectorAsset
    get() {
        if (_language != null) {
            return _language!!
        }
        _language = VectorAssetBuilder(name = "Language", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 7.0f)
                horizontalLineToRelative(7.0f)
                moveToRelative(-2.0f, -2.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(5.0f, 8.0f, 0.0f, false, true, -5.0f, 8.0f)
                moveToRelative(1.0f, -4.0f)
                arcToRelative(7.0f, 4.0f, 0.0f, false, false, 6.7f, 4.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.0f, 19.0f)
                lineToRelative(4.0f, -9.0f)
                lineToRelative(4.0f, 9.0f)
                moveToRelative(-0.9f, -2.0f)
                horizontalLineToRelative(-6.2f)
            }
        }
        .build()
        return _language!!
    }

private var _language: VectorAsset? = null
