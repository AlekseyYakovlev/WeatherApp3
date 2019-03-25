package ru.spb.yakovlev.weatherapp3.data.openweatermap

import ru.spb.yakovlev.weatherapp3.data.ApiKeyProvider

class OpenWeatherApiKeyProvider: ApiKeyProvider {
    override fun getApiKey(): String {
        return "7ece69b476f3d302c10fad333fce1430"
    }
}