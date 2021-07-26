package com.example.android_todo

data class Task (
    val id: Int,
    val state: Int, // 0: TODO 1: DOING 2: DONE
    val description: String
)