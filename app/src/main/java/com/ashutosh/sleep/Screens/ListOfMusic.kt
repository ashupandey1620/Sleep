package com.ashutosh.sleep.Screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.ashutosh.sleep.Components.Toolbar
import com.ashutosh.sleep.Components.tabsMusic
import com.ashutosh.sleep.R
import com.ashutosh.sleep.ui.theme.SleepTheme

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun ListOfMusic(navController:NavController) {
    val painter: Painter = painterResource(id = R.drawable.back)

    var selectedIndex by remember {
        mutableStateOf(0)
    }

    Scaffold(modifier = Modifier.fillMaxSize() ,
        topBar = {
            Toolbar(
                     navController,
                "Music"
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


                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 3.dp) ,
                    verticalArrangement = Arrangement.Top ,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    
                    Spacer(modifier = Modifier.fillMaxWidth().height(60.dp))


                    TabRow(selectedTabIndex = selectedIndex ,
                        modifier = Modifier.fillMaxWidth() ,
                        contentColor = Color.Transparent ,
                        containerColor = Color.Transparent ,
                        indicator = { tabPositions ->
                            if (selectedIndex < tabPositions.size) {
                                TabRowDefaults.Indicator(
                                    Modifier.tabIndicatorOffset(tabPositions[selectedIndex]) ,
                                    color = Color.White
                                )
                            }
                        } ,
                        divider = {
                        }
                    ) {

                        tabsMusic.forEachIndexed { index , tabData ->


                            if (index == selectedIndex) {
                                Tab(
                                    selected = index == selectedIndex ,
                                    onClick = { selectedIndex = index } ,
                                    text = {
                                        Text(
                                            text = tabData.title ,
                                            style = TextStyle(fontSize = 16.sp)
                                        )
                                    } ,
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .clip(RoundedCornerShape(25.dp))
                                        .background(Color.Transparent) ,
                                    selectedContentColor = Color.White ,
                                    unselectedContentColor = Color.White

                                )
                            } else {
                                Tab(
                                    selected = index == selectedIndex ,
                                    onClick = { selectedIndex = index } ,
                                    text = {
                                        Text(
                                            text = tabData.title ,
                                            style = TextStyle(fontSize = 14.sp)
                                        )
                                    } ,
                                    selectedContentColor = Color.White ,
                                    unselectedContentColor = Color.White

                                )
                            }
                        }
                    }


                }

                }

        }
    )
}

@Preview()
@Composable
fun ListOfMusicScreenPreview() {
    SleepTheme {
//        HomeScreen()
    }
}

