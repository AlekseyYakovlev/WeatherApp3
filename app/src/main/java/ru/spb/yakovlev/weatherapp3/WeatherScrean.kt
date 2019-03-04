package ru.spb.yakovlev.weatherapp3

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class WeatherScrean : Fragment() {

    companion object {
        fun newInstance() = WeatherScrean()
    }

    private lateinit var viewModel: WeatherScreanViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.weather_screan_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(WeatherScreanViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
