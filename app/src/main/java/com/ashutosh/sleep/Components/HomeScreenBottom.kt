package com.ashutosh.sleep.Components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccessAlarms
import androidx.compose.material3.Icon
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ashutosh.sleep.R
import com.ashutosh.sleep.Screens.HomeScreen
import com.ashutosh.sleep.Screens.SupportActionHome
import com.ashutosh.sleep.ui.theme.SleepTheme



data class SupportActionMusic(
    val icon: Int,
    val mainText: String,
    val supportText: String,
    val time:String
)

@Composable
fun HomeScreenBottom() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .clip(RoundedCornerShape(30.dp))
            .background(Color.DarkGray.copy(alpha = 0.8f)) ,
        verticalArrangement = Arrangement.Center ,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {


        val ItemsList2 = listOf(

            SupportActionHome(
                R.drawable.music,
                "Music",
                "Calm",
            ) ,

            SupportActionHome(
                R.drawable.goal,
                "Goal",
                "De-Stress") ,

            SupportActionHome(
                R.drawable.factors,
                "Factors",
                "Sleep Factors") ,

            SupportActionHome(
                R.drawable.jet,
                "Jet Lag",
                "Check Tips") ,

            SupportActionHome(
                R.drawable.sleep,
                "Sleep Stories",
                "MoonLight",)

        )

        Text(
            text = "PRACTICE" ,
            color = Color.White ,
            fontSize = 18.sp ,
            lineHeight = 18.sp ,
            fontWeight = FontWeight.Medium ,
            modifier = Modifier.padding(8.dp)
        )

        Spacer(modifier = Modifier
            .fillMaxWidth()
            .height(15.dp))


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(horizontal = 20.dp)
                ,
            verticalAlignment = Alignment.CenterVertically ,
            horizontalArrangement = Arrangement.SpaceEvenly
        )
        {
            CircularButtons(icon= R.drawable.dream,"Dream")
            CircularButtons(icon= R.drawable.kids,"Kids")
            CircularButtons(icon= R.drawable.like,"Love")
            CircularButtons(icon= R.drawable.like,"Love")
        }


        LazyVerticalGrid(
            modifier = Modifier
                .fillMaxWidth()
                .height(280.dp) ,
            columns = GridCells.Fixed(2) ,
            userScrollEnabled = false ,

            contentPadding = PaddingValues(
                start = 12.dp ,
                top = 16.dp ,
                end = 12.dp ,
                bottom = 16.dp
            ) ,
            content = {


                items(ItemsList2.size) { index ->
                    SupportActionItemHome(
                        ItemsList2[index].icon ,
                        ItemsList2[index].mainText ,
                        ItemsList2[index].supportText
                    ) {}
                }


            }
        )



        Row(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(horizontal = 10.dp)
                .padding(bottom = 30.dp)
                .clip(RoundedCornerShape(10.dp))
                .background(Color.Gray.copy(alpha = 0.6f))
            ,
            horizontalArrangement = Arrangement.Center ,
            verticalAlignment = Alignment.Top
        ) {

            Box(modifier = Modifier
                .fillMaxWidth(0.1f)
                .height(60.dp) ,
                contentAlignment = Alignment.TopCenter){

                Icon(
                    painter = painterResource(id = R.drawable.play) ,
                    contentDescription = "" ,
                    tint = Color.White ,
                    modifier = Modifier
                        .size(65.dp)
                        .clickable {

                        }
                )
            }

            Column(modifier = Modifier.fillMaxWidth(0.8f)) {
                Text(
                    text = "Weather" ,
                    color = Color.White ,
                    fontSize = 16.sp ,
                    lineHeight = 16.sp ,
                    fontWeight = FontWeight.Normal ,
                    modifier = Modifier
                        .padding(horizontal = 8.dp)
                        .padding(top = 10.dp)
                )
                Text(
                    text = "There will be addition of 500 ml to 1 litre of water to your daily intake based on the weather temperature." ,
                    color = Color.White ,
                    fontSize = 16.sp ,
                    lineHeight = 18.sp ,
                    fontWeight = FontWeight.Normal ,
                    modifier = Modifier.padding(horizontal = 8.dp)
                        .padding(bottom = 10.dp)

                )

            }

            Box(modifier = Modifier
                .fillMaxWidth()
                .height(70.dp),
                contentAlignment = Alignment.Center
                ){

               Switch(checked = true , onCheckedChange = {},
                   colors = SwitchDefaults.colors(checkedThumbColor = Color.Green,
                       checkedTrackColor = Color.White))
            }


        }

    }
}


@Preview()
@Composable
fun HomeScreenPreview() {
    SleepTheme {
        HomeScreenBottom()
    }
}
