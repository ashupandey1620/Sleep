package com.ashutosh.sleep.Components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun CircularButtons(icon: Int , s: String) {
    Column(
        modifier = Modifier
            .size(70.dp)
            .clip(CircleShape)
            .background(Color.DarkGray.copy(alpha = 0.8f)) ,
        verticalArrangement = Arrangement.Center ,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Icon(
            painter = painterResource(id = icon) ,
            contentDescription = "" ,
            tint = Color.White ,
            modifier = Modifier
                .size(22.dp)
                .clickable {

                }
        )

        Text(
            text = "PRACTICE" ,
            color = Color.White ,
            fontSize = 9.sp ,
            lineHeight = 10.sp ,
            fontWeight = FontWeight.Medium ,
            modifier = Modifier.padding(8.dp)
        )

    }
}