package com.ashutosh.sleep.Screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.ashutosh.sleep.Components.Toolbar
import com.ashutosh.sleep.R
import com.ashutosh.sleep.ui.theme.SleepTheme

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun SleepStories() {
    val painter: Painter = painterResource(id = R.drawable.back)

    Scaffold(modifier = Modifier.fillMaxSize() ,
        topBar = {
            Toolbar(
//                     navController
            )
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

            }

        }
    )
}

@Preview()
@Composable
fun SleepStoriesScreenPreview() {
    SleepTheme {
        SleepStories()
    }
}

