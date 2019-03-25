package ru.spb.yakovlev.weatherapp3.data

import ru.spb.yakovlev.weatherapp3.domain.City

interface CitiesRepositiry {
    val city: List<City>
}