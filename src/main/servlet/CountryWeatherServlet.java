package main.servlet;

import flexjson.JSONSerializer;
import main.service.CountryWeatherService;
import main.vo.CountryWeather;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/CountryWeather")
public class CountryWeatherServlet {
    private final CountryWeatherService weatherService = new CountryWeatherService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //相应类型为JSON

        response.setContentType("text/json;charset=utf-8");

        PrintWriter out = response.getWriter();

        //调用业务层访问数据

        List<CountryWeather> weathers = weatherService.findAllCountryWeathers();

        //创建JSON转换对象

        JSONSerializer serializer = new JSONSerializer();

        serializer.exclude("class");

        String serialize = serializer.serialize(weathers);

        //输出客户端

        out.print(serialize);


    }
}
