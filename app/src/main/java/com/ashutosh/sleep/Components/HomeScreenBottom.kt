package com.ashutosh.sleep.Components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccessAlarms
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ashutosh.sleep.R
import com.ashutosh.sleep.Screens.HomeScreen
import com.ashutosh.sleep.ui.theme.SleepTheme

@Composable
fun HomeScreenBottom() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .background(Color.LightGray.copy(alpha = 0.6f)) ,
        verticalArrangement = Arrangement.Center ,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "PRACTICE" ,
            color = Color.White ,
            fontSize = 18.sp ,
            lineHeight = 18.sp ,
            fontWeight = FontWeight.Medium ,
            modifier = Modifier.padding(8.dp)
        )

        Spacer(modifier = Modifier.fillMaxWidth()
            .height(15.dp))


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(horizontal = 20.dp) ,
            verticalAlignment = Alignment.CenterVertically ,
            horizontalArrangement = Arrangement.SpaceEvenly
        )
        {
            CircularButtons(icon= R.drawable.dream,"Dream")
            CircularButtons(icon= R.drawable.kids,"Kids")
            CircularButtons(icon= R.drawable.like,"Love")
            CircularButtons(icon= R.drawable.like,"Love")
        }


    }
}

@Composable
fun CircularButtons(icon: Int , s: String) {
    Column(
        modifier = Modifier
            .size(70.dp)
            .clip(CircleShape)
            .background(Color.LightGray.copy(alpha = 0.6f)) ,
        verticalArrangement = Arrangement.Center ,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Icon(
            painter = painterResource(id = icon),
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

@Preview()
@Composable
fun HomeScreenPreview() {
    SleepTheme {
        HomeScreenBottom()
    }
}
