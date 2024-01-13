package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.BuildingStadium: ImageVector
    get() {
        if (_buildingStadium != null) {
            return _buildingStadium!!
        }
        _buildingStadium = Builder(name = "BuildingStadium", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                moveToRelative(-8.0f, 0.0f)
                arcToRelative(8.0f, 2.0f, 0.0f, true, false, 16.0f, 0.0f)
                arcToRelative(8.0f, 2.0f, 0.0f, true, false, -16.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 12.0f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 0.94f, 2.51f, 1.785f, 6.0f, 2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(3.435f, -0.225f, 6.0f, -1.07f, 6.0f, -2.0f)
                verticalLineToRelative(-7.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 6.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(7.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 6.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(7.0f)
            }
        }
        .build()
        return _buildingStadium!!
    }

private var _buildingStadium: ImageVector? = null
