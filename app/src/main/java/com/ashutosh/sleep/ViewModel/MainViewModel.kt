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
import com.ashutosh.sleep.NetworkModule.RequestPost
import com.ashutosh.sleep.NetworkModule.RequestPut
import com.ashutosh.sleep.NetworkModule.ResponseGet
import com.ashutosh.sleep.Repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val repository: Repository) : ViewModel() {


    private val _showToast = mutableStateOf(false)
    val showToast: MutableState<Boolean> = _showToast

    private val _toastMessage = mutableStateOf("")
    val toastMessage: MutableState<String> = _toastMessage

    private val _PostResult = MutableLiveData<Repository.PostResult>()
    val postResult: LiveData<Repository.PostResult>
        get() = _PostResult

    var loadingState by mutableStateOf(false)

    var error by mutableStateOf(false)

    val uid = "6309a9379af54f142c65fbfe"

    fun requestPost(request: RequestPost) {

        viewModelScope.launch {
            _PostResult.value = Repository.PostResult.Loading
            val result = repository.postCheck(uid, request)
            _PostResult.value = result

            when (val result = result) {
                is Repository.PostResult.Success -> {
                    val response = result.loginResponse
                    loadingState = false

                    Log.d("",response.toString())

                }
                Repository.PostResult.NetworkError -> {
                    loadingState = false
                    _showToast.value = true
                    _toastMessage.value = "Network error occurred"
                }
                is Repository.PostResult.Error -> {
                    loadingState = false
                    _showToast.value = true
                    _toastMessage.value = "Error: ${result.errorMessage}"
                }
                Repository.PostResult.Loading -> {
                    // Handle loading state
                    loadingState = true
                }
                null -> {
                    // Handle loading state
                    loadingState = true
                }
            }
        }
    }








    private val _PutResult = MutableLiveData<Repository.PutResult>()
    val putResult: LiveData<Repository.PutResult>
        get() = _PutResult



    fun requestPost(request: RequestPut) {
        viewModelScope.launch {
            _PutResult.value = Repository.PutResult.Loading
            val result = repository.putRequest(uid,request)
            _PutResult.value = result

            when (val result = result) {
                is Repository.PutResult.Success -> {
                    val response = result.response
                    loadingState = false

                    Log.d("",response.toString())


                }
                Repository.PutResult.NetworkError -> {
                    loadingState = false
                    _showToast.value = true
                    _toastMessage.value = "Network error occurred"
                }
                is Repository.PutResult.Error -> {
                    loadingState = false
                    _showToast.value = true
                    _toastMessage.value = "Error: ${result.errorMessage}"
                }
                Repository.PutResult.Loading -> {
                    // Handle loading state
                    loadingState = true
                }
                null -> {
                    // Handle loading state
                    loadingState = true
                }
            }
        }
    }



    private val _getResponse = MutableLiveData<ResponseGet>()
    val getResponse : LiveData<ResponseGet> = _getResponse


    fun getResponse() {
        viewModelScope.launch {


            val result = repository.getResponse(uid)

            if (result != null) {

                Log.d("GET RESPONSE DATA",result.toString())


            }
        }
    }

}