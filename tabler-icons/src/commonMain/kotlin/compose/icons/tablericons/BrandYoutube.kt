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

public val TablerIcons.BrandYoutube: VectorAsset
    get() {
        if (_brandYoutube != null) {
            return _brandYoutube!!
        }
        _brandYoutube = VectorAssetBuilder(name = "BrandYoutube", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 5.0f)
                lineTo(17.0f, 5.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 21.0f, 9.0f)
                lineTo(21.0f, 15.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 17.0f, 19.0f)
                lineTo(7.0f, 19.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 3.0f, 15.0f)
                lineTo(3.0f, 9.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 7.0f, 5.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 9.0f)
                lineToRelative(5.0f, 3.0f)
                lineToRelative(-5.0f, 3.0f)
                close()
            }
        }
        .build()
        return _brandYoutube!!
    }

private var _brandYoutube: VectorAsset? = null
