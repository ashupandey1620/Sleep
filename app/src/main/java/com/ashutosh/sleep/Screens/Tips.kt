package com.ashutosh.sleep.Screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import com.ashutosh.sleep.Components.Toolbar
import com.ashutosh.sleep.Components.ToolbarNF
import com.ashutosh.sleep.R

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Tips(navController:NavController) {
    val painter: Painter = painterResource(id = R.drawable.back)

    Scaffold(modifier = Modifier.fillMaxSize() ,
        topBar = {
            ToolbarNF(
                navController,
                "Jet lag Tips"
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


                    Column (modifier = Modifier.fillMaxSize()
                        .background(Color.Black.copy(alpha = 0.7f))
                    ) {

                    }

            }

        }


        )
}