package com.example.koinexample

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object RetrofitInstance {

    private val retrofit = Retrofit.Builder()
        .baseUrl("http://example.com")
        .addConverterFactory(MoshiConverterFactory.create())
        .build()

    val retrofitInstance by lazy { retrofit.create(MyApi::class.java)}
}