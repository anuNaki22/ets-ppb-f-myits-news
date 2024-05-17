package com.myits.newsapp.service.dto

data class ErrorResponse(
    val code: String,
    val message: String,
    val status: String
)