package com.example.koinexample

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class MainViewModel: ViewModel() {

    private val mainRepo = RepositoryImpl()

    init {
        Log.d(MAIN_VIEW_MODEL, "Main View Model initialized.")
        doNetworkCall()
    }

    private fun doNetworkCall() = viewModelScope.launch {
        // TODO: finish networking call demonstration for this demo.
        // mainRepo.doSomeNetworkCall()
    }

    companion object {
        const val MAIN_VIEW_MODEL = "VIEW_MODEL"
    }
}