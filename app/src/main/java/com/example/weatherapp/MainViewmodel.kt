package com.example.weatherapp

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.weatherapp.model.Post
import com.example.weatherapp.repository.Repository
import kotlinx.coroutines.launch

class MainViewmodel(private val  repository: Repository):ViewModel() {
val weatherRes: MutableLiveData<Post> = MutableLiveData()
    fun getWeather(){
        viewModelScope.launch {
            val response:Post = repository.getWeather()
            weatherRes.value=response
        }
    }
}