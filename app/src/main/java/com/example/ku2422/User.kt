package com.example.ku2422

//pk userId
data class User(
    val userId: String = "",
    val userName: String = "",
    val userImg: String = "",
    val totalReviewNum: Int = 0,
    val friendId:String = " "   //ArrayList<String> = arrayListOf()
)
