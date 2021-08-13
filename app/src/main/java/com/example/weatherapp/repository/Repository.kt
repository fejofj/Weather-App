package com.example.weatherapp.repository

import com.example.weatherapp.api.RetrofitInstance

import com.example.weatherapp.model.Post


class Repository(lat:Double,lon:Double,api:String) {
val lat = lat
    val lon = lon
    val api =api
    suspend fun getWeather()
    : Post {
        return RetrofitInstance.api.getWeather(lat,lon,api)
    }
}