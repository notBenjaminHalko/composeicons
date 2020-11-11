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

public val TablerIcons.CurrencyPound: VectorAsset
    get() {
        if (_currencyPound != null) {
            return _currencyPound!!
        }
        _currencyPound = VectorAssetBuilder(name = "CurrencyPound", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 18.5f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.0f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.0f, 0.5f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 2.0f, -2.5f)
                verticalLineToRelative(-7.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 7.45f, -2.0f)
                moveToRelative(-2.55f, 6.0f)
                horizontalLineToRelative(-7.0f)
            }
        }
        .build()
        return _currencyPound!!
    }

private var _currencyPound: VectorAsset? = null
