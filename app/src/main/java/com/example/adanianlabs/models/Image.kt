package com.example.adanianlabs.models

data class Image(
    val hits: List<Hit>,
    val total: Int,
    val totalHits: Int
)