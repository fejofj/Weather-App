package com.example.weatherapp.api

import com.example.weatherapp.model.Post
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {
//https://api.openweathermap.org/data/2.5/weather?lat=10.0199498&lon=77.0255205&appid=432815a1727a48cafc241d7128cb2743
   // https://api.openweathermap.org/data/2.5/weather?q=idukki&appid=432815a1727a48cafc241d7128cb2743
    @GET("weather")
    suspend fun getWeather(
       @Query("lat") lat:Double,
       @Query("lon")lon:Double,
       @Query("appid")appid:String
        ):Post
}