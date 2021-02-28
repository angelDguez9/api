package com.example.myapplication.repository

import com.example.myapplication.api.RetrofitInstance
import com.example.myapplication.model.Post

class Repository {

    suspend fun getPost(): Post{
        return RetrofitInstance.api.getPost()
    }
}