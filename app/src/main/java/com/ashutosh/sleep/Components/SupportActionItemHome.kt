package com.ashutosh.sleep.Components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
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
import com.ashutosh.sleep.Screens.HomeScreen
import com.ashutosh.sleep.ui.theme.SleepTheme

@Composable
fun SupportActionItemHome(
    icon: Int ,
    mainText: String ,
    supportText: String ,
    onClick: () -> Unit
) {

    Column(
        modifier = Modifier
            .padding(4.dp)
            .fillMaxWidth()
            .wrapContentHeight()
            .clip(RoundedCornerShape(10.dp))
            .background(Color.LightGray.copy(alpha = 0.8f))


    ) {

        Row(modifier = Modifier
            .fillMaxWidth()
            ,verticalAlignment = Alignment.CenterVertically) {


            Box(
                modifier = Modifier
                    .size(40.dp) ,
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    painter = painterResource(id = icon) ,
                    contentDescription = "",
                    tint = Color.White,
                    modifier = Modifier.fillMaxSize()
                        .padding(7.dp)
                )
            }



            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = mainText,
                    color = Color.White,
                    fontSize = 16.sp,
                    lineHeight = 16.sp,
                    fontWeight = FontWeight.Medium,
                )
            }
        }


        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 10.dp)
            ,verticalAlignment = Alignment.CenterVertically) {

            Spacer(modifier = Modifier.width(40.dp))

            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = supportText,
                    color = Color.White,
                    fontSize = 18.sp,
                    lineHeight = 18.sp,
                    fontWeight = FontWeight.Medium,
                )
            }
        }
//        Spacer(modifier = Modifier.width(8.dp))


    }

    
}



