package com.ashutosh.sleep.ViewModel

import android.util.Log
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ashutosh.sleep.Main.MainEvent
import com.ashutosh.sleep.Main.MainState
import com.ashutosh.sleep.NetworkModule.RequestPost
import com.ashutosh.sleep.NetworkModule.RequestPut
import com.ashutosh.sleep.NetworkModule.ResponseGet
import com.ashutosh.sleep.Repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val repository: Repository) : ViewModel() {


    var state by mutableStateOf(MainState())

    fun onEvent(event: MainEvent) {
        when (event) {
            is MainEvent.Update -> {
                viewModelScope.launch {

                }
            }

            is MainEvent.Delete -> {
                viewModelScope.launch {

                }
            }

            is MainEvent.Insert -> {

            }

            is MainEvent.Append -> {


            }
        }
    }

    private val _postResult = MutableStateFlow<Repository.PostResult>(Repository.PostResult.Loading)
    val postResult: StateFlow<Repository.PostResult> = _postResult

    var loadingState by mutableStateOf(false)



    val uid = "6309a9379af54f142c65fbfe"

    fun requestPost(request: RequestPost) {
        viewModelScope.launch {
            repository.postCheck(uid, request)
                .catch { e ->
                    Log.d("okhttp","Exception $e")
                }
                .collect { result ->
                    when (result) {
                        is Repository.PostResult.Success -> {
                            loadingState = false
                            Log.d("", result.postResponse.toString())
                        }
                        Repository.PostResult.NetworkError -> {
                            loadingState = false

                            Log.d("okhttp Network Error","Errror")
                        }
                        is Repository.PostResult.Error -> {
                            loadingState = false

                            Log.d("okhttp Error","Unknown Error")
                        }
                        is Repository.PostResult.Loading -> {
                            loadingState = true
                            Log.d("okhttp Loading","Loading from ViewModel")
                        }
                    }
                }
        }
    }





    private val _putResult = MutableStateFlow<Repository.PutResult>(Repository.PutResult.Loading)
    val putResult: StateFlow<Repository.PutResult> = _putResult



    // Function to perform a PUT request
    fun requestPut(request: RequestPut) {
        viewModelScope.launch {
            repository.putRequest(uid, request)
                .catch { e ->
                    // Handle exception here
                }
                .collect { result ->
                    when (result) {
                        is Repository.PutResult.Success -> {
                            loadingState = false
                            Log.d("", result.response.toString())
                        }
                        Repository.PutResult.NetworkError -> {
                            loadingState = false

                        }
                        is Repository.PutResult.Error -> {
                            loadingState = false

                        }
                        Repository.PutResult.Loading -> {
                            loadingState = true
                        }
                    }
                }
        }
    }


    private val _getResponse = MutableStateFlow<ResponseGet?>(null)
    val getResponse: StateFlow<ResponseGet?> = _getResponse


    fun requestGet() {
        viewModelScope.launch {
            val response = repository.getResponse(uid)
            _getResponse.value = response
        }
    }
}