package com.ashutosh.sleep.Repository

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.ashutosh.sleep.API.SleepApi
import com.ashutosh.sleep.NetworkModule.RequestPost
import com.ashutosh.sleep.NetworkModule.RequestPut
import com.ashutosh.sleep.NetworkModule.ResponseGet
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.io.IOException
import javax.inject.Inject


class Repository @Inject constructor(private val api : SleepApi){

    sealed class PostResult {
        object Loading : PostResult()
        data class Success(val postResponse: Any) : PostResult()
        object NetworkError : PostResult()
        data class Error(val errorMessage: String) : PostResult()
    }

    suspend fun postCheck(uid:String, request: RequestPost): Flow<PostResult> {
        return flow {
            emit(PostResult.Loading)
            try {
                val response = api.sleepPost(uid , System.currentTimeMillis() , request)
                val responseBody = response.body()
                if (response.isSuccessful && responseBody != null) {
                    emit(PostResult.Success(responseBody))
                } else {
                    emit(PostResult.Error("Error: ${response.code()}"))
                }
            } catch (e: IOException) {
                emit(PostResult.NetworkError)
            } catch (e: Exception) {
                emit(PostResult.Error("Error occurred: ${e.message}"))
            }
        }
    }
    sealed class PutResult {
        object Loading : PutResult()
        data class Success(val response: Any) : PutResult()
        object NetworkError : PutResult()
        data class Error(val errorMessage: String) : PutResult()
    }

    suspend fun putRequest(uid:String, request: RequestPut): Flow<PutResult> = flow {
        emit(PutResult.Loading)
        try {
            val response = api.sleepPut(uid, System.currentTimeMillis(), request)
            val responseBody = response.body()
            if (response.isSuccessful && responseBody != null) {
                emit(PutResult.Success(responseBody))
            } else {
                emit(PutResult.Error("Error: ${response.code()}"))
            }
        } catch (e: IOException) {
            emit(PutResult.NetworkError)
        } catch (e: Exception) {
            emit(PutResult.Error("Error occurred: ${e.message}"))
        }
    }

    suspend fun getResponse(uid: String): ResponseGet? {
        val currentTimestamp = System.currentTimeMillis()
        return try {
            val response = api.sleepGet(uid, currentTimestamp)
            response.body()
        } catch (e: Exception) {
            Log.d("ErrorHandling",e.toString())
            null
        }
    }



}