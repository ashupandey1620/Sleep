package com.ashutosh.sleep.Repository

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.ashutosh.sleep.API.SleepApi
import com.ashutosh.sleep.NetworkModule.RequestPost
import com.ashutosh.sleep.NetworkModule.RequestPut
import com.ashutosh.sleep.NetworkModule.ResponseGet
import java.io.IOException
import javax.inject.Inject


class Repository @Inject constructor(private val api : SleepApi){

    sealed class PostResult {
        object Loading : PostResult()
        data class Success(val loginResponse: Any) : PostResult()
        object NetworkError : PostResult()
        data class Error(val errorMessage: String) : PostResult()
    }

    private val _postResponseLiveData = MutableLiveData<Any?>()
    val postResponseLiveData : LiveData<Any?>
        get() = _postResponseLiveData

    suspend fun postCheck(request: RequestPost): PostResult {
        return try {
            val response = api.sleepPost(request)

            val responseBody = response.body()
            if (response.isSuccessful && responseBody != null) {
                _postResponseLiveData.postValue(responseBody)
                PostResult.Success(responseBody)
            } else {
                PostResult.Error("Error: ${response.code()}")
            }
        } catch (e: IOException) {
            // Handle network error
            PostResult.NetworkError
        } catch (e: Exception) {
            // Handle other exceptions
            PostResult.Error("Error occurred: ${e.message}")
        }
    }





    sealed class PutResult {
        object Loading : PutResult()
        data class Success(val response: Any) : PutResult()
        object NetworkError : PutResult()
        data class Error(val errorMessage: String) : PutResult()
    }

    private val _putResponseLiveData = MutableLiveData<Any?>()
    val putResponseLiveData: LiveData<Any?>
        get() = _putResponseLiveData

    suspend fun putRequest(request: RequestPut): PutResult {
        return try {
            val response = api.sleepPut(request)

            val responseBody = response.body()
            if (response.isSuccessful && responseBody != null) {
                _putResponseLiveData.postValue(responseBody)
                PutResult.Success(responseBody)
            } else {
                PutResult.Error("Error: ${response.code()}")
            }
        } catch (e: IOException) {
            // Handle network error
            PutResult.NetworkError
        } catch (e: Exception) {
            // Handle other exceptions
            PutResult.Error("Error occurred: ${e.message}")
        }
    }



    suspend fun getResponse(): ResponseGet? {
        return try {
            val response = api.sleepGet()

            response.body()
        } catch (e: Exception) {

            Log.d("ErrorHandling",e.toString())
            null
        }
    }


}