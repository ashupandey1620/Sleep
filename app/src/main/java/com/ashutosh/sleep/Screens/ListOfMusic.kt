package com.ashutosh.sleep.Screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.ashutosh.sleep.Components.SupportActionGoal
import com.ashutosh.sleep.Components.SupportActionItemMusic
import com.ashutosh.sleep.Components.Toolbar
import com.ashutosh.sleep.Components.tabsMusic
import com.ashutosh.sleep.R
import com.ashutosh.sleep.ui.theme.SleepTheme
import com.google.gson.Gson
import java.net.URLEncoder


data class SupportActionMusic(
    val icon: Int,
    val mainText: String,
    val supportText: String,
    val time:String
)


@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun ListOfMusic(
//    navController:NavController
) {
    val painter: Painter = painterResource(id = R.drawable.back)

    var selectedIndex by remember {
        mutableStateOf(0)
    }


    val ItemsList1 = listOf(

        SupportActionMusic(
            R.drawable.girl,
            "De-stress",
            "May 2020",
            "69 mins"),

        SupportActionMusic(
            R.drawable.boy,
            "Fall Asleep",
            "May 2020",
            "69 mins"),

        SupportActionMusic(
            R.drawable.girl,
            "Take a break",
            "May 2020",
            "69 mins"),

        SupportActionMusic(
            R.drawable.boy,
            "clear your mind",
            "May 2020",
            "69 mins")

    )



    val ItemsList2 = listOf(

        SupportActionMusic(
            R.drawable.girl,
            "De-stress",
            "NightTime",
            "69 mins"),

        SupportActionMusic(
            R.drawable.boy,
            "Fall Asleep",
            "NightTime",
            "69 mins"),

        SupportActionMusic(
            R.drawable.girl,
            "Take a break",
            "NightTime",
            "69 mins"),

        SupportActionMusic(
            R.drawable.boy,
            "clear your mind",
            "NightTime",
            "69 mins")

    )

    Scaffold(modifier = Modifier.fillMaxSize() ,
        topBar = {
//            Toolbar(
//                     navController,
//                "Music"
//            )
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
                         ,
                    verticalArrangement = Arrangement.Top ,
                    horizontalAlignment = Alignment.Start
                ) {
                    
                    Spacer(modifier = Modifier
                        .fillMaxWidth()
                        .height(60.dp))


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


                    Column(modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .verticalScroll(rememberScrollState())) {


                        Text(
                            modifier = Modifier
                                .wrapContentWidth()
                                .padding(top = 10.dp)
                                .padding(horizontal = 15.dp) ,
                            text = "Recently Played" ,
                            color = Color.White ,
                            fontSize = 18.sp ,
                            lineHeight = 20.sp ,
                            fontWeight = FontWeight.Bold ,
                        )


                        LazyVerticalGrid(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(295.dp) ,
                            columns = GridCells.Fixed(2) ,
                            userScrollEnabled = false ,

                            contentPadding = PaddingValues(
                                start = 8.dp ,
                                top = 10.dp ,
                                end = 8.dp ,
                                bottom = 10.dp
                            ) ,
                            content = {


                                items(ItemsList1.size) { index ->
                                    SupportActionItemMusic(
                                        ItemsList1[index].icon ,
                                        ItemsList1[index].mainText ,
                                        ItemsList1[index].supportText ,
                                        ItemsList1[index].time ,
                                        {}
                                    )
                                }


                            }
                        )

                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .wrapContentHeight()
                                .padding(horizontal = 20.dp) ,
                            verticalAlignment = Alignment.CenterVertically ,
                            horizontalArrangement = Arrangement.SpaceBetween
                        )
                        {
                            Text(
                                text = "+ ${ItemsList1.size - 4} more" ,
                                color = Color.LightGray ,
                                fontSize = 17.sp ,
                                lineHeight = 18.sp ,
                                fontWeight = FontWeight.Normal ,
                            )

                            Icon(
                                painter = painterResource(id = R.drawable.expand_circle_down) ,
                                contentDescription = "" ,
                                tint = Color.White ,
                                modifier = Modifier
                                    .size(30.dp)
                                    .clickable {

                                    }
                            )
                        }





                        Spacer(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(20.dp)
                        )

                        Text(
                            modifier = Modifier
                                .wrapContentWidth()
                                .padding(top = 10.dp)
                                .padding(horizontal = 15.dp) ,
                            text = "Trending" ,
                            color = Color.White ,
                            fontSize = 18.sp ,
                            lineHeight = 20.sp ,
                            fontWeight = FontWeight.Bold ,
                        )


                        LazyVerticalGrid(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(290.dp) ,
                            columns = GridCells.Adaptive(128.dp) ,
                            userScrollEnabled = false ,

                            contentPadding = PaddingValues(
                                start = 12.dp ,
                                top = 16.dp ,
                                end = 12.dp ,
                                bottom = 16.dp
                            ) ,
                            content = {


                                items(ItemsList2.size) { index ->
                                    SupportActionItemMusic(
                                        ItemsList2[index].icon ,
                                        ItemsList2[index].mainText ,
                                        ItemsList2[index].supportText ,
                                        ItemsList2[index].time ,
                                        {}
                                    )
                                }


                            }
                        )

                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .wrapContentHeight()
                                .padding(horizontal = 20.dp) ,
                            verticalAlignment = Alignment.CenterVertically ,
                            horizontalArrangement = Arrangement.SpaceBetween
                        )
                        {
                            Text(
                                text = "+ ${ItemsList2.size - 4} more" ,
                                color = Color.LightGray ,
                                fontSize = 17.sp ,
                                lineHeight = 18.sp ,
                                fontWeight = FontWeight.Normal ,
                            )

                            Icon(
                                painter = painterResource(id = R.drawable.expand_circle_down) ,
                                contentDescription = "" ,
                                tint = Color.White ,
                                modifier = Modifier
                                    .size(30.dp)
                                    .clickable {

                                    }
                            )
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
        ListOfMusic()
    }
}

