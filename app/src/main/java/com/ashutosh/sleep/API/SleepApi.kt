package com.ashutosh.sleep.API

import com.ashutosh.sleep.NetworkModule.RequestPost
import com.ashutosh.sleep.NetworkModule.RequestPut
import com.ashutosh.sleep.NetworkModule.ResponseGet
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Query

interface SleepApi {

    @Headers("Content-Type: application/json")
    @GET("/tools/sleep/get/")
    suspend fun sleepGet(
        @Query("uid") uid: String ,
        @Query("date") date: Long ,
    ): Response<ResponseGet>


    @Headers("Content-Type: application/json")
    @POST("/tools/sleep/activity/post/")
    suspend fun sleepPost(
        @Query("uid") uid: String ,
        @Query("date") date: Long ,
        @Body refreshToken: RequestPost
    ): Response<Any>


    @Headers("Content-Type: application/json")
    @PUT("/tools/sleep/put/")
    suspend fun sleepPut(
        @Query("uid") uid: String ,
        @Query("date") date: Long ,
        @Body requestBody: RequestPut
    ): Response<Any>

}