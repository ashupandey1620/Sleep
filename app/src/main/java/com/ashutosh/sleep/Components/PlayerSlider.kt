package com.ashutosh.sleep.Components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ashutosh.sleep.R

@Composable
fun PlayerSlider() {
    
    Column(modifier = Modifier
        .clip(RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp))
            .background(Color.Gray.copy(alpha = 0.65f))
            ) {
        Slider(modifier = Modifier.fillMaxWidth()
            .padding(horizontal = 15.dp), value = 0.4f , onValueChange = {}, colors = SliderDefaults.colors(
            thumbColor = Color.Green,
            activeTrackColor = Color.White
        ))
        Row (modifier = Modifier
            .fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween){
            Text(
                modifier = Modifier
                    .wrapContentWidth()
                    .padding(bottom = 10.dp)
                    .padding(horizontal = 15.dp) ,
                text = "1:35" ,
                color = Color.White ,
                fontSize = 12.sp ,
                lineHeight = 20.sp ,
                fontWeight = FontWeight.Bold ,
            )


            Text(
                modifier = Modifier
                    .wrapContentWidth()
                    .padding(bottom = 10.dp)
                    .padding(horizontal = 15.dp) ,
                text = "3:30" ,
                color = Color.White ,
                fontSize = 12.sp ,
                lineHeight = 20.sp ,
                fontWeight = FontWeight.Bold ,
            )
        }

        Row (modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround) {


            Icon(
                painter = painterResource(id = R.drawable.play) ,
                contentDescription = "" ,
                tint = Color.White ,
                modifier = Modifier
                    .size(50.dp)
                    .clickable {

                    }
            )


            Icon(
                painter = painterResource(id = R.drawable.play) ,
                contentDescription = "" ,
                tint = Color.White ,
                modifier = Modifier
                    .size(50.dp)
                    .clickable {

                    }
            )


            Icon(
                painter = painterResource(id = R.drawable.play) ,
                contentDescription = "" ,
                tint = Color.White ,
                modifier = Modifier
                    .size(50.dp)
                    .clickable {

                    }
            )


            Icon(
                painter = painterResource(id = R.drawable.play) ,
                contentDescription = "" ,
                tint = Color.White ,
                modifier = Modifier
                    .size(50.dp)
                    .clickable {

                    }
            )


            Icon(
                painter = painterResource(id = R.drawable.play) ,
                contentDescription = "" ,
                tint = Color.White ,
                modifier = Modifier
                    .size(50.dp)
                    .clickable {

                    }
            )



        }

    }
    
}