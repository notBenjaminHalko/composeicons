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

public val TablerIcons.PictureInPictureOn: VectorAsset
    get() {
        if (_pictureInPictureOn != null) {
            return _pictureInPictureOn!!
        }
        _pictureInPictureOn = VectorAssetBuilder(name = "PictureInPictureOn", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.0f, 19.0f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineToRelative(-10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(4.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 14.0f)
                lineTo(20.0f, 14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 21.0f, 15.0f)
                lineTo(21.0f, 18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 20.0f, 19.0f)
                lineTo(15.0f, 19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 14.0f, 18.0f)
                lineTo(14.0f, 15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 15.0f, 14.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 9.0f)
                lineTo(11.0f, 13.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 13.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
            }
        }
        .build()
        return _pictureInPictureOn!!
    }

private var _pictureInPictureOn: VectorAsset? = null
