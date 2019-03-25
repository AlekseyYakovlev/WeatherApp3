package ru.spb.yakovlev.weatherapp3.data

import ru.spb.yakovlev.weatherapp3.domain.City

class TestCityRepo:CitiesRepositiry{
    override val city: List<City>
        get() = mutableListOf(
            City("Saint-Petersburg","RU"),
            City("Moscow","RU"),
            City("London","UK")
        )
}