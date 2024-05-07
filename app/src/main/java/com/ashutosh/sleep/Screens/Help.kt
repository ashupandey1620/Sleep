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
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.ashutosh.sleep.Components.Toolbar
import com.ashutosh.sleep.Components.WhiteToolBar
import com.ashutosh.sleep.R

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Help(navController:NavController) {



    Scaffold(modifier = Modifier.fillMaxSize() ,
        topBar = {
            WhiteToolBar(
                navController,
                "Help - Sleep Tool"
            )
        } ,
        content = {


            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.LightGray)
                    .verticalScroll(rememberScrollState())
                    .padding(horizontal = 20.dp)
            ) {

                Spacer(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(60.dp)
                )

                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .clip(RoundedCornerShape(10.dp))
                        .background(Color.White)
                        .padding(10.dp)

                ) {
                    Text(
                        text = "What makes a good night's sleep?" ,
                        color = Color(0xFF51a2d1) ,
                        fontSize = 15.sp ,
                        lineHeight = 18.sp,
                        fontWeight = FontWeight.Bold ,
                    )
                    Text(
                        text = "Sleep impacts every aspect of our life. Here are some of the main points you might want to take into consideration in order to get a good night's sleep" ,
                        color = Color.LightGray ,
                        fontSize = 14.sp ,
                        lineHeight = 17.sp,
                        fontWeight = FontWeight.Normal ,
                    )

                }

                Spacer(modifier = Modifier.fillMaxWidth()
                    .height(10.dp))



                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .clip(RoundedCornerShape(10.dp))
                        .background(Color.White)


                ) {
                    Image(
                        painter = painterResource(id = R.drawable.sleepman) ,
                        contentDescription = "" ,
                        modifier = Modifier
                            .fillMaxSize() ,
                        contentScale = ContentScale.FillBounds
                    )


                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentHeight()
                            .padding(horizontal = 15.dp)
                            .padding(vertical = 10.dp)


                    ) {
                        Text(
                            text = "Check Why Sleep is essential to our health?" ,
                            color = Color(0xFF51a2d1) ,
                            fontSize = 15.sp ,
                            lineHeight = 18.sp ,
                            fontWeight = FontWeight.Bold ,
                        )
                        Text(
                            text = "It strongly influences our capacity to recover both mentally and physically, allows us to store memories, influences our mood, and promotes \"growing\" in children. It basically impacts every aspect of our life by affecting the way we think, learn, behave, feel, and interact with others.\n\n" +
                                    "Poor sleep and sleep deprivation have been associated with cardiovascular and metabolic diseases, impaired mental capacity, and poor motor coordination. Specialists have shown that “healthy sleep” might be the best way to prevent Alzheimer’s disease and that there is a strong relationship between sleep and proper functioning of the immune system.\n\n" +
                                    "While sleep disorders and the impact of sleep on general health have been extensively studied, the conditions necessary for good sleep, often called “sleep hygiene,” is sometimes overlooked.\n\n" +
                                    "Many times we prefer to look directly at pathology and label our sleeping problems as a disease. We turn too quickly to medication and skip the simple yet critical changes we could easily make to get better sleep.\n\n" +
                                    "Here are the essential rules for good sleep:\n\n" +
                                    " Sleep in well-ventilated rooms and air out your home frequently\n\n" +
                                    "Pay attention to room temperature, air humidity, and pollution\n\n" +
                                    " Avoid noise, even if you don’t think it bothers you\n\n" +
                                    "Turn off all sources of light\n\n" +
                                    "Avoid consuming foods like alcohol,sugar beverages, fruits and snacks before bed\n\n" +
                                    "Include sports in your daily activity\n\n" +
                                    "Clear your mind\n\n" +
                                    " Set up a healthy bedtime routine" ,
                            color = Color.LightGray ,
                            fontSize = 14.sp ,
                            lineHeight = 17.sp ,
                            fontWeight = FontWeight.Normal,
                        )
                    }
                }

                Spacer(modifier = Modifier.fillMaxWidth()
                    .height(30.dp))

            }
        }
    )
}