package com.ashutosh.sleep.Components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.ashutosh.sleep.R
import com.ashutosh.sleep.Screens.ListOfMusic
import com.ashutosh.sleep.ui.theme.SleepTheme


@ExperimentalMaterial3Api
@Composable
fun SupportActionItemMusic(
    image: Int , mainText: String , supportText: String, time:String, onClick: () -> Unit ,
//    navController: NavController
) {

    val color = remember{ mutableStateOf(false) }

    Column(modifier = Modifier
        .width(200.dp)
        .wrapContentHeight()
        .padding(4.dp)
        .clip(RoundedCornerShape(10.dp))
        .background(Color.White.copy(alpha = 0.6f))
    ) {


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp)
            ,
            verticalAlignment = Alignment.CenterVertically,


        ) {
            Image(
                painter = painterResource(id = image) ,
                contentDescription = "" ,
                modifier = Modifier
                    .fillMaxWidth(0.8f)
                    .clip(RoundedCornerShape(10.dp))
                    .padding(10.dp),
                contentScale = ContentScale.FillBounds
            )
            Icon(
                painter = painterResource(id = R.drawable.tick) ,
                contentDescription = "" ,
                tint = Color.White  ,
                modifier = Modifier
                    .size(30.dp)
                    .clickable {

                }
            )
        }

        Row(
            modifier = Modifier
                .padding(horizontal = 12.dp)
                .fillMaxWidth()
                .wrapContentHeight(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start

        ) {

            Column(
                modifier = Modifier
                    .fillMaxWidth(0.7f)
                    .wrapContentHeight() , verticalArrangement = Arrangement.SpaceBetween ,
                horizontalAlignment = Alignment.Start
            ) {

                Text(
                    text = mainText ,
                    color = Color.White ,
                    fontSize = 12.sp ,
                    lineHeight = 13.sp ,
                    fontWeight = FontWeight.Medium ,
                )


                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight() ,
                    verticalAlignment = Alignment.CenterVertically ,
                    horizontalArrangement = Arrangement.SpaceBetween
                )
                {
                    Text(
                        text = supportText ,
                        color = Color.White ,
                        fontSize = 11.sp ,
                        lineHeight = 12.sp ,
                        fontWeight = FontWeight.Medium ,
                    )

                    Text(
                        text = time ,
                        color = Color.White ,
                        fontSize = 11.sp ,
                        lineHeight = 12.sp ,
                        fontWeight = FontWeight.Medium ,
                    )
                }
            }





            Spacer(modifier = Modifier.padding(3.dp))



            Column(
                modifier = Modifier
                    .size(50.dp) , verticalArrangement = Arrangement.Center ,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {


                Icon(
                    painter = painterResource(id = R.drawable.play) ,
                    contentDescription = "" ,
                    tint = Color.White ,
                    modifier = Modifier
                        .size(50.dp)
                        .padding(8.dp)
                        .clickable {

                        }
                )

            }

        }

        }
    }




@OptIn(ExperimentalMaterial3Api::class)
@Preview()
@Composable
fun ListOfMusicScreenPreview() {
    SleepTheme {
        SupportActionItemMusic(
            image = R.drawable.sleepman ,
            mainText = "Relaxing Sleep" ,
            supportText = "May 2020" ,
            time = "69 min" ,
            onClick = { /*TODO*/ } ,
        )
    }
}


