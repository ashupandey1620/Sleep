package com.ashutosh.sleep.Components

import androidx.compose.runtime.Composable
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

@Composable
fun backRainBow(): Brush {

    val colorsDark = listOf(
        Color(0xFFa7a738) ,
        Color(0xFF84a43c) ,
        Color(0xFF409940) ,
        Color(0xFF589e7e) ,
        Color(0xFF68a1a2) ,
        Color(0xFF538aeb) ,
        Color(0xFF3979ac) ,
        Color(0xFF525cac) ,
        Color(0xFF6f49ab) ,
        Color(0xFF9530a7) ,
        Color(0xFFa624ac) ,
        Color(0xFFaf1e97) ,
    )


    return Brush.linearGradient(
        colors = colorsDark, start = Offset.Zero, end = Offset.Infinite
    )
}

@Composable
fun whiteRainBow(): Brush {

    val colorsDark = listOf(
        Color(0xFFffffff) ,
        Color(0xFFfffffe) ,
    )


    return Brush.linearGradient(
        colors = colorsDark, start = Offset.Zero, end = Offset.Infinite
    )
}
