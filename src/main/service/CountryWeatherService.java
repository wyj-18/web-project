package main.service;

import main.Dao.CountryWeatherDao;
import main.vo.CountryWeather;

import java.util.List;

public class CountryWeatherService {
    private final CountryWeatherDao countryWeatherDao = new CountryWeatherDao();





    public List<CountryWeather> findAllCountryWeathers(){

        return countryWeatherDao.findAllCountryWeathers();

    }

}
