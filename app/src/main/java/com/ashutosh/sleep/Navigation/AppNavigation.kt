package com.ashutosh.sleep.Navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.Lifecycle
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
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
        startDestination = Routes.HomeScreen.name
    ) {
        composable(route = Routes.HomeScreen.name) {
            HomeScreen(
//                navController
            )
        }
        composable(route = Routes.SleepFactor.name) {
            SleepFactorScreen()
        }
        composable(route = Routes.SleepDisturbance.name) {
            SleepDisturbanceScreen()
        }
        composable(route = Routes.Tips.name) {
            Tips()
        }
        composable(route = Routes.Goals.name) {
            GoalScreen()
        }
        composable(route = Routes.ListOfMusic.name) {
            ListOfMusic()
        }
        composable(route = Routes.SleepStories.name) {
            SleepStories()
        }
        composable(route = Routes.Help.name) {
            Help()
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
    Help
}