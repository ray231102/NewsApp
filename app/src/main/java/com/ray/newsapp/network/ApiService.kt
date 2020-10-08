package com.ray.newsapp.network

import com.ray.newsapp.model.Newsmodel
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {

    @GET("top-headlines?country=id&apiKey=7659de32d86f41bfbf3864f433c6252b")
    fun getNews() : Call<Newsmodel>

}