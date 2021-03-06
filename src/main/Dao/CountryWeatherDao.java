package main.Dao;

import main.utils.DataSourceUtils;
import main.vo.CountryWeather;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class CountryWeatherDao {
    //通过数据类得到数据对象

    private final QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());

    //查询所有的天气

    public List<CountryWeather> findAllCountryWeathers() {

        try {

            return runner.query("select * from country_weather", new BeanListHandler<>(CountryWeather.class));

        } catch (SQLException e) {

            e.printStackTrace();

            throw new RuntimeException(e);

        }

    }
}
