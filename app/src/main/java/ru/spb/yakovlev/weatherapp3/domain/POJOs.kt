package ru.spb.yakovlev.weatherapp3.domain


data class City (val name: String, val country: String = "RU")

data class CityWeather (val name: String)

data class Forecast(val cityWeather: CityWeather)

