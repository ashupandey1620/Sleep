package com.ashutosh.sleep.Screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
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
import com.ashutosh.sleep.Components.SupportActionGoal
import com.ashutosh.sleep.Components.Toolbar
import com.ashutosh.sleep.R
import com.ashutosh.sleep.ui.theme.SleepTheme
import com.google.gson.Gson
import java.net.URLEncoder

data class SupportAction(
    val icon: Int,
    val mainText: String,
    val supportText: String
)

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun GoalScreen(navController:NavController) {
    val painter: Painter = painterResource(id = R.drawable.back)


    val ItemsList = listOf(

        SupportAction(
            R.drawable.girl,
            "De-stress",
            "NightTime"),

        SupportAction(
            R.drawable.boy,
        "Fall Asleep",
        "NightTime"),

        SupportAction(
            R.drawable.girl,
            "Take a break",
            "NightTime"),

        SupportAction(
            R.drawable.boy,
            "clear your mind",
            "NightTime")

    )

    Scaffold(modifier = Modifier.fillMaxSize() ,
        topBar = {
            Toolbar(
                     navController,
                "Goals"
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

            }


           Column(modifier = Modifier.padding(10.dp)) {

               Spacer(modifier = Modifier
                   .fillMaxWidth()
                   .height(60.dp))

               Text(
                   text = "Select the Goal you want to achieve",
                   color = Color.White,
                   fontSize = 19.sp,
                   lineHeight = 20.sp,
                   fontWeight = FontWeight.Medium,
               )

               LazyVerticalGrid(
                   modifier = Modifier
                       .fillMaxSize(),
                   columns = GridCells.Fixed(2) ,
                   userScrollEnabled = true ,

                   contentPadding = PaddingValues(
                       start = 12.dp ,
                       top = 16.dp ,
                       end = 12.dp ,
                       bottom = 16.dp
                   ) ,
                   content = {

                       items(ItemsList.size) { index ->
                           SupportActionGoal(
                               ItemsList[index].icon ,
                               ItemsList[index].mainText ,
                               ItemsList[index].supportText ,
                               { } ,
                               navController
                           )
                       }

                   }
               )
           }

        }
    )
}

@Preview()
@Composable
fun GoalScreenPreview() {
    SleepTheme {
//        GoalScreen()
    }
}

