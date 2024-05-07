package com.ashutosh.sleep.NetworkModule

import com.ashutosh.sleep.API.SleepApi
import com.ashutosh.sleep.Util.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {

//    val client = OkHttpClient.Builder()
//        .hostnameVerifier { _, _ -> true }
//        .build()

    @Singleton
    @Provides
    fun providesOkHttpClient(): OkHttpClient {
        val interceptor = HttpLoggingInterceptor()
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY)

        return OkHttpClient.Builder()
            .addInterceptor(interceptor)
            .hostnameVerifier { _, _ -> true }
            .build()
    }

    @Singleton
    @Provides
    @Named("retrofit")
    fun providesRetrofit(): Retrofit {
        return Retrofit.Builder().baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(providesOkHttpClient())
            .build()
    }


    @Singleton
    @Provides
    fun providesIgnitiaAPI(@Named("retrofit") retrofit: Retrofit): SleepApi {
        return retrofit.create(SleepApi::class.java)
    }



}