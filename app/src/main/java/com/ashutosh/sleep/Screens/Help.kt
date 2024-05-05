package com.ashutosh.sleep.Screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.navigation.NavController
import com.ashutosh.sleep.Components.Toolbar
import com.ashutosh.sleep.Components.WhiteToolBar

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Help(navController:NavController) {



    Scaffold(modifier = Modifier.fillMaxSize() ,
        topBar = {
            WhiteToolBar(
                navController,
                "Help - Sleep Tool"
            )
        } ,
        content = {



        }
    )
}