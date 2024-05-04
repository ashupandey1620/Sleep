package com.ashutosh.sleep.Screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.ashutosh.sleep.Components.SupportAccountItem
import com.ashutosh.sleep.Components.SupportAccountItemSD
import com.ashutosh.sleep.Components.Toolbar
import com.ashutosh.sleep.Navigation.Routes
import com.ashutosh.sleep.R
import com.ashutosh.sleep.ui.theme.SleepTheme

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun SleepDisturbanceScreen(navController: NavController) {
    val painter: Painter = painterResource(id = R.drawable.back)

    Scaffold(modifier = Modifier.fillMaxSize() ,
        topBar = {
            Toolbar(
                     navController,
                "Sleep Disturbances"
            )
        } ,
        content = {

            Box(
                modifier = Modifier
                    .fillMaxSize()
            ) {

                Image(
                    painter = painter ,
                    contentDescription = "" ,
                    modifier = Modifier
                        .fillMaxSize() ,
                    contentScale = ContentScale.FillBounds
                )

                Column(modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 20.dp)) {

                    Spacer(modifier = Modifier.fillMaxWidth()
                        .height(60.dp))

                    Text(
                        text = "Tap to add/remove the reason for sleep disturbances",
                        color = Color.White,
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold,
                    )

                    Spacer(modifier = Modifier.fillMaxWidth()
                        .height(10.dp))


                    SupportAccountItemSD(
                        icon = R.drawable.addother,
                        mainText = "Add Other",
                        onClick = {

                        },
                        navController
                    )

                    SupportAccountItemSD(
                        icon = R.drawable.dream,
                        mainText = "Dream",
                        onClick = {

                        },
                        navController
                    )

                    SupportAccountItemSD(
                        icon = R.drawable.kids,
                        mainText = "Kids",
                        onClick = {

                        },
                        navController
                    )

                    SupportAccountItemSD(
                        icon = R.drawable.love,
                        mainText = "Love",
                        onClick = {

                        },
                        navController
                    )

                    SupportAccountItemSD(
                        icon = R.drawable.water,
                        mainText = "Water",
                        onClick = {

                        },
                        navController
                    )

                    SupportAccountItemSD(
                        icon = R.drawable.tiolet,
                        mainText = "Toilet",
                        onClick = {

                        },
                        navController
                    )
                }

            }

        }
    )
}

@Preview()
@Composable
fun SleepDisturbancePreview() {
    SleepTheme {
//        SleepDisturbanceScreen()
    }
}

