package com.ashutosh.sleep.Components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.ashutosh.sleep.R


@ExperimentalMaterial3Api
@Composable
fun SupportActionStories(
    icon: Int , mainText: String , supportText: String, time:String, onClick: () -> Unit ,
    navController: NavController
) {

    val color = remember{ mutableStateOf(false) }

    Row(modifier = Modifier
        .fillMaxWidth()
        .height(180.dp)
        .padding(4.dp)
        .clip(RoundedCornerShape(10.dp))
        .background(Color.White.copy(alpha = 0.6f))
      ) {


        Column(
            modifier = Modifier
                .fillMaxWidth(0.4f)
                .wrapContentHeight()
                .clip(RoundedCornerShape(10.dp))

        ) {
            Image(
                painter = painterResource(id = icon) ,
                contentDescription = "" ,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(10.dp),
                contentScale = ContentScale.FillBounds
            )
        }

        Column(
            modifier = Modifier
                .padding(12.dp)
                .fillMaxWidth()
                .wrapContentHeight()


        ) {

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(25.dp) , verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                Text(
                    text = mainText ,
                    color = Color.White ,
                    fontSize = 15.sp ,
                    lineHeight = 17.sp ,
                    fontWeight = FontWeight.Medium ,
                )


                Icon(
                    painter = painterResource(id = R.drawable.tick) ,
                    contentDescription = "" ,
                    tint = Color.White  ,
                    modifier = Modifier.clickable {
                        color.value = !color.value
                    }
                )
            }

            Spacer(modifier = Modifier.padding(3.dp))

            Text(
                text = supportText ,
                color = Color.White ,
                fontSize = 12.sp ,
                lineHeight = 14.sp ,
                fontWeight = FontWeight.Medium ,
            )

            Spacer(modifier = Modifier.padding(3.dp))


            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(25.dp) , verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {


                Icon(
                    painter = painterResource(id = R.drawable.play) ,
                    contentDescription = "" ,
                    tint = Color.White,
                    modifier = Modifier.clickable {
                        color.value = !color.value
                    }
                )


                Icon(
                    painter = painterResource(id = R.drawable.like) ,
                    contentDescription = "" ,
                    tint = if (!color.value) Color.White else Color.Red ,
                    modifier = Modifier.clickable {
                        color.value = !color.value
                    }
                )
            }

            Spacer(modifier = Modifier.padding(3.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(25.dp) , verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {


                Text(
                    text = "Play" ,
                    color = Color.White ,
                    fontSize = 13.sp ,
                    lineHeight = 15.sp ,
                    fontWeight = FontWeight.Medium ,
                )

                Spacer(modifier = Modifier.padding(8.dp))

                Text(
                    text = time ,
                    color = Color.White ,
                    fontSize = 13.sp ,
                    lineHeight = 15.sp ,
                    fontWeight = FontWeight.Medium ,
                )

            }

        }
    }
}
