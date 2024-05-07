package com.ashutosh.sleep.NetworkModule

data class RequestPut(
    val code: String,
    val id: String,
    val prc: List<Prc2>,
    val type: Int,
    val uid: String
)

data class Value2(
    val id: String,
    val name: String,
    val value: String
)

data class Prc2(
    val code: String,
    val dsc: String,
    val id: String,
    val ttl: String,
    val type: Int,
    val values: List<Value2>
)