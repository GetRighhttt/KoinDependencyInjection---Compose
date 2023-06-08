package com.example.koinexample

import retrofit2.Response
import retrofit2.http.GET

interface MyApi {

    @GET("the/endpoint")
    fun makeNetworkCall()
}
