package com.ashutosh.sleep.Screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.ashutosh.sleep.Components.TipsItem
import com.ashutosh.sleep.Components.Toolbar
import com.ashutosh.sleep.Components.ToolbarNF
import com.ashutosh.sleep.R

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Tips(navController:NavController) {
    val painter: Painter = painterResource(id = R.drawable.back)

    Scaffold(modifier = Modifier.fillMaxSize() ,
        topBar = {
            ToolbarNF(
                navController,
                "Jet lag Tips"
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


                    Column (modifier = Modifier
                        .fillMaxSize()
                        .background(Color.Black.copy(alpha = 0.7f))
                        .verticalScroll(rememberScrollState())
                        .padding(10.dp)
                    ) {
                        Spacer(modifier = Modifier
                            .fillMaxWidth()
                            .height(60.dp))


                        Text(
                            text = "Here are few tips and tricks that may help prevent jet lag or reduce its effects",
                            color = Color.White,
                            fontSize = 21.sp,
                            lineHeight = 22.sp,
                            fontWeight = FontWeight.Medium,
                        )

                        TipsItem(
                            icon = R.drawable.sun,
                            mainText = "Get Some Sun",
                            supportText = "Getting Outside during daylight hours can jump-start alertness. Light" +
                                    "helps your body recognize it's time to be awake. Artificial light sources (such as a lamp) can offer similar benefits if you can't get outside.",
                            onClick = {

                            },
                            navController
                        )

                        TipsItem(
                            icon = R.drawable.time,
                            mainText = "Adjust your sleep-wake schedule",
                            supportText = "Getting on the sleep-wake schedule at your destination quickly may help with jet lag symptoms.",
                            onClick = {

                            },
                            navController
                        )

                        TipsItem(
                            icon = R.drawable.bed,
                            mainText = "focus on getting quality sleep",
                            supportText = "Sleeping on the plane. If you can, may help your body adjust faster to a new time zone.",
                            onClick = {

                            },
                            navController
                        )

                        TipsItem(
                            icon = R.drawable.brf,
                            mainText = "Avoid new foods",
                            supportText = "Choosing foods your body knows how to digest (for a day or two) may help ease any digestive symptom of the jet lag.",
                            onClick = {

                            },
                            navController
                        )

                        TipsItem(
                            icon = R.drawable.drop,
                            mainText = "Drink lots of water",
                            supportText = "Drinking plenty of water can combat the effects of dehydration after a ling flight. Choose bottled water if you have any questions about water safety. Avoid caffeine and alcohol, which can make you more dehydrated.",
                            onClick = {

                            },
                            navController
                        )

                        TipsItem(
                            icon = R.drawable.sleep,
                            mainText = "Get Solid sleep before your trip",
                            supportText = "Try to start off by getting plenty of uninterrupted sleep in the nights leading up to you flight.",
                            onClick = {

                            },
                            navController
                        )


                        TipsItem(
                            icon = R.drawable.alarm,
                            mainText = "Don't Over-schedule your first days",
                            supportText = "Anticipate some degree of jetlag symptoms and don't overbook your first day at your destination. Budget enough time for sleep and keep buffers in your schedule in case you aren't feeling well.",
                            onClick = {

                            },
                            navController
                        )


                    }

            }

        }


        )
}