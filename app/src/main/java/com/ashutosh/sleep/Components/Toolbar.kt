package com.ashutosh.sleep.Components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Air
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.ashutosh.sleep.R
import com.ashutosh.sleep.Screens.HomeScreen
import com.ashutosh.sleep.ui.theme.SleepTheme

@Composable
fun Toolbar(
//    navController: NavController
) {
        val context = LocalContext.current

//    FullSizeBlur {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
                .background(Black.copy(alpha = 0.4f))
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

                }) {
                    Icon(
                        tint = White ,
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
                    text = "Sleep Tool" ,
                    color = White ,
                    fontWeight = FontWeight.Medium
                )
            }



            IconButton(onClick = {

            }) {
                Icon(
                    tint = Color.White ,
                    painter = painterResource(id = R.drawable.frame_1656) , contentDescription = "" ,
                    modifier = Modifier.size(24.dp)
                )

            }

        }
//    }

}

@Preview()
@Composable
fun AddTaskScreenPreview() {
    SleepTheme {
        HomeScreen()
    }
}

