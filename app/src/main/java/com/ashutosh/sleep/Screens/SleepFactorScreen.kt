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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import com.ashutosh.sleep.Components.InputType
import com.ashutosh.sleep.Components.SupportAccountItemSD
import com.ashutosh.sleep.Components.Toolbar
import com.ashutosh.sleep.R
import com.ashutosh.sleep.ui.theme.SleepTheme

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun SleepFactorScreen(navController: NavController) {
    val painter: Painter = painterResource(id = R.drawable.back)

    Scaffold(modifier = Modifier.fillMaxSize() ,
        topBar = {
            Toolbar(
                     navController,
                "Sleep factor"
            )
        } ,
        bottomBar = {
            Button(shape = RoundedCornerShape(5.dp) , modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth()
                .padding(5.dp), onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(Color(0xFF0277bd))) {
                Text(
                    text = "DONE",
                    color = Color.White,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Medium,
                )
            }
        },
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


                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .verticalScroll(rememberScrollState())
                        .padding(horizontal = 20.dp)
                ) {

                    Spacer(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(60.dp)
                    )

                    Text(
                        text = "Tap to add/remove Sleep Factors" ,
                        color = Color.White ,
                        fontSize = 22.sp ,
                        fontWeight = FontWeight.Bold ,
                    )

                    Spacer(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(20.dp)
                    )


                    SupportAccountItemSD(
                        icon = R.drawable.addother ,
                        mainText = "Add Other" ,
                        onClick = {

                        } ,
                        navController
                    )

                    SupportAccountItemSD(
                        icon = R.drawable.dream ,
                        mainText = "Alcohol" ,
                        onClick = {

                        } ,
                        navController
                    )

                    SupportAccountItemSD(
                        icon = R.drawable.kids ,
                        mainText = "Jet Lag" ,
                        onClick = {

                        } ,
                        navController
                    )
                    
                    InputType(s = "Please Enter the Time Difference","3 hours ahead")

                    Spacer(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(20.dp)
                    )


                    SupportAccountItemSD(
                        icon = R.drawable.coffee ,
                        mainText = "Caffeine" ,
                        onClick = {

                        } ,
                        navController
                    )

                    SupportAccountItemSD(
                        icon = R.drawable.cigar ,
                        mainText = "Smoking" ,
                        onClick = {

                        } ,
                        navController
                    )


                    SupportAccountItemSD(
                        icon = R.drawable.pain ,
                        mainText = "Pain" ,
                        onClick = {

                        } ,
                        navController
                    )

                    SupportAccountItemSD(
                        icon = R.drawable.workout ,
                        mainText = "WorkOut" ,
                        onClick = {

                        } ,
                        navController
                    )

                    Spacer(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(60.dp)
                    )

                }
            }

        }
    )
}


@Preview()
@Composable
fun SleepFactorScreenPreview() {
    SleepTheme {
//       SleepFactorScreen()
    }
}

