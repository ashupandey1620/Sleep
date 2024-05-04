package com.ashutosh.sleep.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.ashutosh.sleep.Components.SupportAccountItem
import com.ashutosh.sleep.Navigation.Routes
import com.ashutosh.sleep.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Central(navController:NavController) {
    Column(
        modifier = Modifier.fillMaxSize()
            .background(Color.DarkGray)
            .padding(start = 20.dp, end = 20.dp),
        verticalArrangement = Arrangement.Center
    ) {

        SupportAccountItem(
            icon = R.drawable.frame_1656,
            mainText = "Home Screen",
            onClick = {
                navController.navigate(Routes.HomeScreen.name)
            },
            navController
        )
        SupportAccountItem(
            icon = R.drawable.frame_1656,
            mainText = "Sleep Factors",
            onClick = {
                navController.navigate(Routes.SleepFactor.name)
            },
            navController
        )
        SupportAccountItem(
            icon = R.drawable.frame_1656,
            mainText = "Sleep Disturbance",
            onClick = {
                navController.navigate(Routes.SleepDisturbance.name)
            },
            navController
        )
        SupportAccountItem(
            icon = R.drawable.frame_1656,
            mainText = "Tips",
            onClick = {
                navController.navigate(Routes.Tips.name)
            },
            navController
        )
        SupportAccountItem(
            icon = R.drawable.frame_1656,
            mainText = "Goals",
            onClick = {
                navController.navigate(Routes.Goals.name)
            },
            navController
        )
        SupportAccountItem(
            icon = R.drawable.frame_1656,
            mainText = "List Of Music",
            onClick = {
                navController.navigate(Routes.ListOfMusic.name)
            },
            navController
        )

        SupportAccountItem(
            icon = R.drawable.frame_1656,
            mainText = "Sleep Stories",
            onClick = {
                navController.navigate(Routes.SleepStories.name)
            },
            navController
        )

        SupportAccountItem(
            icon = R.drawable.frame_1656,
            mainText = "Help",
            onClick = {
                navController.navigate(Routes.Help.name)
            },
            navController
        )



    }
}