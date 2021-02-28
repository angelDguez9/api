package com.example.myapplication

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.model.Post
import com.example.myapplication.repository.Repository
import kotlinx.coroutines.launch

class MainViewModel(private val repository: Repository): ViewModel() {

    val myResonse: MutableLiveData<Post> = MutableLiveData()
    fun getPost(){
        viewModelScope.launch{
            val respose: Post = repository.getPost()
            myResonse.value = respose
        }
    }

}