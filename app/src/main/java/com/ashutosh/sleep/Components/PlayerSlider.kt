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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddAlarm
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Shuffle
import androidx.compose.material.icons.filled.SkipNext
import androidx.compose.material.icons.filled.SkipPrevious
import androidx.compose.material3.Icon
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
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
        .clip(RoundedCornerShape(topStart = 20.dp , topEnd = 20.dp))
        .background(Color.Gray.copy(alpha = 0.75f))
        .padding(bottom = 10.dp)
            ) {
        Slider(modifier = Modifier
            .fillMaxWidth()
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
                    .padding(horizontal = 18.dp) ,
                text = "1:35" ,
                color = Color.White ,
                fontSize = 12.sp ,
                lineHeight = 14.sp ,
                fontWeight = FontWeight.Bold ,
            )


            Text(
                modifier = Modifier
                    .wrapContentWidth()
                    .padding(bottom = 10.dp)
                    .padding(horizontal = 18.dp) ,
                text = "3:30" ,
                color = Color.White ,
                fontSize = 12.sp ,
                lineHeight = 14.sp ,
                fontWeight = FontWeight.Bold ,
            )
        }

        Row (modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically) {


            Icon(
                imageVector = Icons.Filled.Shuffle ,
                contentDescription = "" ,
                tint = Color.White ,
                modifier = Modifier
                    .size(35.dp)
                    .clickable {

                    }
            )


            Icon(
                imageVector = Icons.Filled.SkipPrevious,
                contentDescription = "" ,
                tint = Color.White ,
                modifier = Modifier
                    .size(35.dp)
                    .clickable {

                    }
            )


            Icon(
                imageVector = Icons.Filled.PlayArrow,
                contentDescription = "" ,
                tint = Color.White ,
                modifier = Modifier
                    .size(35.dp)
                    .clickable {

                    }
            )


            Icon(
                imageVector = Icons.Filled.SkipNext,
                contentDescription = "" ,
                tint = Color.White ,
                modifier = Modifier
                    .size(35.dp)
                    .clickable {

                    }
            )


            Icon(
                painter = painterResource(id = R.drawable.like),
                contentDescription = "" ,
                tint = Color.White ,
                modifier = Modifier
                    .size(35.dp)
                    .clickable {

                    }
            )



        }

    }
    
}