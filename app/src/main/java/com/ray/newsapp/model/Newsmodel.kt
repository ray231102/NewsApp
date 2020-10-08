package com.ray.newsapp.model

data class Newsmodel(
    val articles: List<Artikel>,
    val status: String,
    val totalResults: Int
)