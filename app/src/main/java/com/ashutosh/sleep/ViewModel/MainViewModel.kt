package com.ashutosh.sleep.ViewModel

import androidx.lifecycle.ViewModel
import com.ashutosh.sleep.Repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val repository: Repository) : ViewModel() {





}