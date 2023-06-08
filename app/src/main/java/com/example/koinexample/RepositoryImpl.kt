package com.example.koinexample

import com.example.koinexample.ui.theme.MainRepoInterface

class RepositoryImpl (private val api: MyApi) : MainRepoInterface {

    override fun doNetworkCall() {
        // normally use coroutines to suspend this method and execute withContext(Dispatchers.IO)
        api.makeNetworkCall()
    }
}