package com.ashutosh.sleep.NetworkModule

data class ResponseGet(
    val `data`: Data,
    val status: Status
)
data class Data(
    val progressData: ProgressData,
    val toolData: ToolData
)
data class Status(
    val code: Int,
    val err: String,
    val msg: String,
    val retry: Boolean
)
data class ProgressData(
    val ach: Int,
    val date: Int,
    val id: String,
    val rcm: Int,
    val tgt: Int,
    val uid: String
)

data class ToolData(
    val code: String,
    val id: String,
    val prc: List<Prc>,
    val type: Int,
    val uid: String
)

data class Prc(
    val code: String,
    val dsc: String,
    val isMultiSel: Boolean,
    val ttl: String,
    val type: Int,
    val values: List<Value>
)

data class Value(
    val code: String,
    val dsc: String,
    val id: String,
    val ttl: String,
    val url: String
)