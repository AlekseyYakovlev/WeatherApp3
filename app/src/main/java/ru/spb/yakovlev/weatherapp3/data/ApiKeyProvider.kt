package ru.spb.yakovlev.weatherapp3.data

interface ApiKeyProvider {
    fun  getApiKey(): String
}