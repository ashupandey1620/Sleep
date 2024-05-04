package com.ashutosh.sleep.Components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
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
import androidx.navigation.NavController


@ExperimentalMaterial3Api
@Composable
fun TipsItem(
    icon: Int , mainText: String, supportText: String , onClick: () -> Unit ,
    navController: NavController
) {

    Column(
        modifier = Modifier
            .padding(bottom = 10.dp)
            .fillMaxWidth()
            .wrapContentHeight()


    ) {

        Row(modifier = Modifier
            .fillMaxWidth()
            ,verticalAlignment = Alignment.CenterVertically) {

            Spacer(modifier = Modifier.width(10.dp))
            Box(
                modifier = Modifier
                    .size(25.dp) ,
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    painter = painterResource(id = icon) ,
                    contentDescription = "",
                    tint = Color.White,
                )
            }

            Spacer(modifier = Modifier.width(14.dp))

            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = mainText,
                    color = Color.White,
                    fontSize = 18.sp,
                    lineHeight = 21.sp,
                    fontWeight = FontWeight.Medium,
                )
            }
        }


        Row(modifier = Modifier
            .fillMaxWidth()
            ,verticalAlignment = Alignment.CenterVertically) {

            Spacer(modifier = Modifier.width(49.dp))

            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = supportText,
                    color = Color.White,
                    fontSize = 13.sp,
                    lineHeight = 14.sp,
                    fontWeight = FontWeight.Medium,
                )
            }
        }
        Spacer(modifier = Modifier.width(8.dp))


    }
}
