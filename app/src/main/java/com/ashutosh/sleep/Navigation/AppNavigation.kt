package com.ashutosh.sleep.Navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.Lifecycle
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ashutosh.sleep.Screens.Central
import com.ashutosh.sleep.Screens.GoalScreen
import com.ashutosh.sleep.Screens.Help
import com.ashutosh.sleep.Screens.HomeScreen
import com.ashutosh.sleep.Screens.ListOfMusic
import com.ashutosh.sleep.Screens.SleepDisturbanceScreen
import com.ashutosh.sleep.Screens.SleepFactorScreen
import com.ashutosh.sleep.Screens.SleepStories
import com.ashutosh.sleep.Screens.SplashScreen
import com.ashutosh.sleep.Screens.Tips
import com.ashutosh.sleep.ViewModel.MainViewModel

@Composable
fun AppNavigation(mainViewModel: MainViewModel) {
    val navController = rememberNavController()


    NavHost(
        navController = navController,
        startDestination = Routes.Central.name
    ) {
        composable(route = Routes.HomeScreen.name) {
            HomeScreen(
                navController
            )
        }
        composable(route = Routes.SleepFactor.name) {
            SleepFactorScreen(
                navController
            )
        }
        composable(route = Routes.SleepDisturbance.name) {
            SleepDisturbanceScreen(
                navController
            )
        }
        composable(route = Routes.Tips.name) {
            Tips(navController)
        }
        composable(route = Routes.Goals.name) {
            GoalScreen(
                navController
            )
        }
        composable(route = Routes.ListOfMusic.name) {
            ListOfMusic(
                navController
            )
        }
        composable(route = Routes.SleepStories.name) {
            SleepStories(
                navController
            )
        }
        composable(route = Routes.Help.name) {
            Help(navController)
        }
        composable(route = Routes.Central.name) {
            Central(navController)
        }

    }
}

val NavHostController.isValidBackStack
    get() = this.currentBackStackEntry?.lifecycle?.currentState == Lifecycle.State.RESUMED



enum class Routes {
    HomeScreen,
    SleepFactor,
    SleepDisturbance,
    Tips,
    Goals,
    ListOfMusic,
    SleepStories,
    Help,
    Central
}