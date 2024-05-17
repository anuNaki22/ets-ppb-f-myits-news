package com.myits.newsapp.service.dto


data class NewsResponse(
    val nextPage: String,
    val results: List<ResultDTO>,
    val status: String,
    val totalResults: Int
)