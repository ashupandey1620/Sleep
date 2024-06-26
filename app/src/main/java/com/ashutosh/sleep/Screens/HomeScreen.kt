package com.ashutosh.sleep.Screens

import android.annotation.SuppressLint
import android.util.Log
import android.widget.Toast
import androidx.compose.animation.AnimatedVisibility
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
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.ashutosh.sleep.Components.BottomSheet
import com.ashutosh.sleep.Components.Toolbar
import com.ashutosh.sleep.Components.backRainBow
import com.ashutosh.sleep.Components.whiteRainBow
import com.ashutosh.sleep.NetworkModule.RequestPost
import com.ashutosh.sleep.R
import com.ashutosh.sleep.Repository.Repository
import com.ashutosh.sleep.ViewModel.MainViewModel
import com.ashutosh.sleep.ui.theme.SleepTheme
import kotlinx.coroutines.delay
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale


data class SupportActionHome(
    val icon: Int,
    val mainText: String,
    val supportText: String,
)

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeScreen(
    navController: NavController ,
) {


    var showSheet by remember { mutableStateOf(true) }

    val painter: Painter = painterResource(id = R.drawable.back)

    val mainViewModel:MainViewModel= hiltViewModel()

    val postResult by mainViewModel.postResult.collectAsState()


    val fac = listOf("children")
    val dis = listOf("coffee")

    val tempPost = RequestPost(dis,
        fac,
        "De-Stress",
        "6309a9379af54f142c65fbfe",
        "6309a9379af54f142c65fbfe")


    LaunchedEffect(Unit) {
        mainViewModel.requestPost(tempPost)
    }



    var currentTime by remember { mutableStateOf(getCurrentTime()) }

    LaunchedEffect(true) {
        while (true) {
            delay(1000) // Delay for 1 second
            currentTime = getCurrentTime() // Update the time
        }
    }


    Scaffold(modifier = Modifier.fillMaxSize() ,
        topBar = {
                 Toolbar(
                     navController,
                     "Sleep Tool"
                 )
        } ,
        bottomBar = {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {

                AnimatedVisibility(visible = !showSheet) {
                    Icon(
                        painter = painterResource(id = R.drawable.up_arrow) ,
                        contentDescription = "",
                        tint = Color.White,
                        modifier = Modifier
                            .size(35.dp)
                            .clickable {
                                showSheet = true
                            }
                    )
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(60.dp)
                ) {

                    Button(colors = ButtonDefaults.buttonColors(Color(0xFF43a047)) ,
                        shape = RoundedCornerShape(5.dp) ,
                        modifier = Modifier
                            .fillMaxWidth(0.5f)
                            .fillMaxHeight()
                            .padding(4.dp) ,
                        onClick = { /*TODO*/ }) {
                        Text(
                            text = "SCHEDULE" ,
                            color = Color.White ,
                            fontSize = 20.sp ,
                            fontWeight = FontWeight.Medium ,
                        )
                    }


                    Button(colors = ButtonDefaults.buttonColors(Color(0xFF0277bd)) ,
                        shape = RoundedCornerShape(5.dp) ,
                        modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxHeight()
                            .padding(4.dp) ,
                        onClick = { /*TODO*/ }) {
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
                            text = currentTime ,
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
                                color = Color.White ,
                                fontSize = 18.sp ,
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
                        TaskStatus(time="8 hrs",status="Recommended", whiteRainBow())
                        TaskStatus(time="7 hrs",status="Goal", backRainBow())
                        TaskStatus(time="6 hrs",status="Achieved", whiteRainBow())
                    }


                    when (postResult) {
                        is Repository.PostResult.Success -> {
                            val response = (postResult as Repository.PostResult.Success).postResponse
                            Text(text = "Response: $response")
                            Log.d("okhttp Scucess",response.toString())
                        }
                        Repository.PostResult.NetworkError -> {
                            Text(text = "Network error occurred")
                            Log.d("okhttp Network Error","Errror")
                        }
                        is Repository.PostResult.Error -> {
                            val errorMessage = (postResult as Repository.PostResult.Error).errorMessage
                            Text(text = "Error: $errorMessage")
                            Log.d("okhttp Error","Unknown Error")
                        }
                        is Repository.PostResult.Loading -> {
                            CircularProgressIndicator()
                            Log.d("okhttp Loading","Loading")
                        }
                    }



                }
            }

        }
    )
}

@Composable
fun TaskStatus(time: String , status: String , brush: Brush) {
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
            .height(5.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(brush))

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
//        HomeScreen()
    }
}


fun getCurrentTime():String{
    val currentTime = Date()
    val sdf = SimpleDateFormat("HH:mm" , Locale.getDefault())
    return sdf.format(currentTime)
}
