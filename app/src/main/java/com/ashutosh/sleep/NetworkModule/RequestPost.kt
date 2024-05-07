package com.ashutosh.sleep.NetworkModule

data class RequestPost(
    val dis: List<String>,
    val fac: List<String>,
    val goal: String,
    val id: String,
    val uid: String
)