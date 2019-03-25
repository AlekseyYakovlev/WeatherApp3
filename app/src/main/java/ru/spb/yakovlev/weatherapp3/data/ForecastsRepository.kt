package ru.spb.yakovlev.weatherapp3.data

import ru.spb.yakovlev.weatherapp3.domain.CityWeather
import ru.spb.yakovlev.weatherapp3.domain.Forecast

interface ForecastsRepository{
    val forecasts: Map<CityWeather, Forecast>
}