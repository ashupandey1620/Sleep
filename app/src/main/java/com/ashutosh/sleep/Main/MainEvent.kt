package com.ashutosh.sleep.Main

import android.content.Context

sealed class MainEvent {
	data class Update(val context: Context) : MainEvent()
	data class Delete(val context: Context) : MainEvent()
	data class Insert(val freeTime: Long) : MainEvent()
	data class Append(val context: Context) : MainEvent()
}