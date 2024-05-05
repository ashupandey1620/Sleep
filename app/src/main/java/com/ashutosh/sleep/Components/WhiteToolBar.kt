package com.ashutosh.sleep.Components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.ashutosh.sleep.R


@Composable
fun WhiteToolBar(
    navController: NavController ,
    str:String
) {
    val context = LocalContext.current

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp)
            .background(Color.White)
            .padding(horizontal = 10.dp)
            .padding(top = 10.dp)
            .padding(bottom = 5.dp) ,
        horizontalArrangement = Arrangement.SpaceBetween ,
        verticalAlignment = Alignment.CenterVertically
    )
    {

        Row(
            modifier = Modifier
                .wrapContentWidth()
                .wrapContentHeight(align = Alignment.Top) ,
            horizontalArrangement = Arrangement.SpaceBetween ,
            verticalAlignment = Alignment.CenterVertically
        ) {


            IconButton(onClick = {
                navController.popBackStack()
            }) {
                Icon(
                    tint = Color.Green ,
                    imageVector = Icons.Filled.ArrowBackIosNew ,
                    contentDescription = "" ,
                    modifier = Modifier.size(20.dp)
                )

            }

            Text(
                modifier = Modifier
                    .wrapContentSize() ,
                textAlign = TextAlign.Center ,
                fontSize = 20.sp ,
                lineHeight = 22.sp ,
                text = str ,
                color = Color.Black ,
                fontWeight = FontWeight.Medium
            )
        }
    }
}