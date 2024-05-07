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

interface SleepApi {

    @Headers("Content-Type: application/json")
    @GET("/get/?uid=6309a9379af54f142c65fbfe&date=1711860932992")
    suspend fun sleepGet(): Response<ResponseGet>


    @Headers("Content-Type: application/json")
    @POST("/activity/post/?uid=6309a9379af54f142c65fbfe&date=1711860932992")
    suspend fun sleepPost(
        @Body refreshToken: RequestPost
    ):Response<Any>


    @Headers("Content-Type: application/json")
    @PUT("/put/?uid=6309a9379af54f142c65fbfe&date=1711860932992")
    suspend fun sleepPut(
        @Body requestBody: RequestPut
    ): Response<Any>

}