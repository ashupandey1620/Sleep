package com.ashutosh.sleep.Screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccessAlarms
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.ashutosh.sleep.Components.BottomSheet
import com.ashutosh.sleep.NetworkModule.RequestPost
import com.ashutosh.sleep.R
import com.ashutosh.sleep.ViewModel.MainViewModel
import com.ashutosh.sleep.ui.theme.SleepTheme
import dagger.hilt.android.lifecycle.HiltViewModel


data class SupportActionHome(
    val icon: Int,
    val mainText: String,
    val supportText: String,
)

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeScreen(
//    navController: NavController,
) {


    var showSheet by remember { mutableStateOf(true) }

    val painter: Painter = painterResource(id = R.drawable.back)

    val mainViewModel:MainViewModel= hiltViewModel()


    LaunchedEffect(Unit) {
        mainViewModel.getResponse()

    }

    Scaffold(modifier = Modifier.fillMaxSize() ,
        topBar = {
//                 Toolbar(
//                     navController,
//                     "Sleep Tool"
//                 )
        } ,
        bottomBar = {

                    Row (modifier = Modifier
                        .fillMaxWidth()
                        .height(60.dp)){

                        Button(colors = ButtonDefaults.buttonColors(Color(0xFF43a047)), shape = RoundedCornerShape(5.dp) , modifier = Modifier
                            .fillMaxWidth(0.5f)
                            .fillMaxHeight()
                            .padding(4.dp), onClick = { /*TODO*/ }) {
                            Text(
                                text = "SCHEDULE" ,
                                color = Color.White ,
                                fontSize = 20.sp ,
                                fontWeight = FontWeight.Medium ,
                            )
                        }


                        Button(colors = ButtonDefaults.buttonColors(Color(0xFF0277bd)),shape = RoundedCornerShape(5.dp),modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxHeight()
                            .padding(4.dp), onClick = { /*TODO*/ }) {
                            Text(
                                text = "START" ,
                                color = Color.White ,
                                fontSize = 20.sp ,
                                fontWeight = FontWeight.Medium ,
                            )
                        }

                    }


                    if (showSheet) {
                        BottomSheet() {
                            showSheet = false
                        }
                    }
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


                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .verticalScroll(rememberScrollState())
                    ,
                    verticalArrangement = Arrangement.Top ,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    Spacer(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(90.dp)
                    )


                    Column(
                        modifier = Modifier
                            .size(190.dp)
                            .clip(CircleShape)
                            .background(Color.LightGray.copy(alpha = 0.6f))
                        ,
                        verticalArrangement = Arrangement.Center ,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {


                        Text(
                            text = "20:45" ,
                            color = Color.White ,
                            fontSize = 40.sp ,
                            lineHeight = 40.sp ,
                            fontWeight = FontWeight.Medium ,
                        )

                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .wrapContentHeight()
                                .padding(horizontal = 20.dp) ,
                            verticalAlignment = Alignment.CenterVertically ,
                            horizontalArrangement = Arrangement.Center
                        )
                        {

                            Icon(
                                imageVector = Icons.Filled.AccessAlarms,
                                contentDescription = "" ,
                                tint = Color.White ,
                                modifier = Modifier
                                    .size(27.dp)
                                    .clickable {

                                    }
                            )

                            Spacer(modifier = Modifier.padding(5.dp))

                            Text(
                                text = "Off" ,
                                color = Color.LightGray ,
                                fontSize = 20.sp ,
                                lineHeight = 22.sp ,
                                fontWeight = FontWeight.SemiBold ,
                            )
                        }
                    }

                    Spacer(modifier = Modifier.padding(15.dp))

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(90.dp)
                            .padding(horizontal = 15.dp)
                            .clip(RoundedCornerShape(10.dp))
                            .background(Color.DarkGray.copy(alpha = 0.8f))
                        ,
                         verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        TaskStatus(time="8 hrs",status="Recommended")
                        TaskStatus(time="7 hrs",status="Goal")
                        TaskStatus(time="6 hrs",status="Achieved")
                    }



                }
            }

        }
    )
}

@Composable
fun TaskStatus(time: String , status: String) {
    Column(
        Modifier
            .width(110.dp)
            .wrapContentHeight(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = time ,
            color = Color.LightGray ,
            fontSize = 14.sp ,
            lineHeight = 17.sp ,
            fontWeight = FontWeight.SemiBold ,

        )

        Spacer(modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .height(4.dp)
            .background(Color.White))

        Text(
            text = status ,
            color = Color.LightGray ,
            fontSize = 14.sp ,
            lineHeight = 17.sp ,
            fontWeight = FontWeight.SemiBold ,
        )

    }
}

@Preview()
@Composable
fun HomeScreenPreview() {
    SleepTheme {
        HomeScreen()
    }
}



