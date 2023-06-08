package com.example.koinexample

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class MainViewModel(private val mainRepo: RepositoryImpl) : ViewModel() {

    /*
    We could create a instance of our repository without dependency injection
    using composition, however this is not the best approach, and it also make testing a
    little bit more complicated.
     */
//    private val mainRepo = RepositoryImpl()

    init {
        Log.d(MAIN_VIEW_MODEL, "Main View Model initialized.")
        doNetworkCall()
    }

    fun doNetworkCall() = viewModelScope.launch {
        // TODO: finish networking call calling repo impl..
        println("Making network call...")
        mainRepo.doNetworkCall()
    }

    companion object {
        const val MAIN_VIEW_MODEL = "VIEW_MODEL"
    }
}