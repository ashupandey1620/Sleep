package com.ashutosh.sleep.Components

data class TabDataMusic (
    val title : String
)

val tabsMusic = listOf(
    TabDataStories(TabsMusic.Music.value),
    TabDataStories(TabsMusic.Favourite.value),
    TabDataStories(TabsMusic.ThirdParty.value),
)

enum class TabsMusic (val value:String){
    Music("Music"),
    Favourite("Favourite"),
    ThirdParty("Third-party"),
}