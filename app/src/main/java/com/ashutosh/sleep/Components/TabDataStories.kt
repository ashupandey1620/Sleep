package com.ashutosh.sleep.Components

data class TabDataStories (
    val title : String
)

val tabs = listOf(
    TabDataStories(Tabs.Kids.value),
    TabDataStories(Tabs.Popular.value),
    TabDataStories(Tabs.Adult.value),
    TabDataStories(Tabs.Fiction.value)
)

enum class Tabs (val value:String){
    Kids("KIDS"),
    Popular("POPULAR"),
    Adult("ADULTS"),
    Fiction("FICTION")
}