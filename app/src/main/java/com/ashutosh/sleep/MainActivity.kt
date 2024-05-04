package com.ashutosh.sleep

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.ashutosh.sleep.Components.CustomSnackBar
import com.ashutosh.sleep.Navigation.AppNavigation
import com.ashutosh.sleep.ViewModel.MainViewModel
import com.ashutosh.sleep.ui.theme.SleepTheme
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val mainViewModel by viewModels<MainViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        //initializing the splash Screen using API
        installSplashScreen()

        super.onCreate(savedInstanceState)
        setContent {
            SleepTheme {
                AppNavigation(mainViewModel = mainViewModel)
                CustomSnackBar()
            }
        }
    }
}



@Composable
fun Greeting(name: String , modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!" ,
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SleepTheme {
        Greeting("Android")
    }
}