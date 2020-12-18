package main.servlet;

import flexjson.JSONSerializer;
import main.service.BrowserService;
import main.vo.Browser;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/explorer")
public class BrowserServlet {
    private final BrowserService browserService = new BrowserService();


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //指定相应类型为JSON

        response.setContentType("text/json;charset=utf-8");

        PrintWriter out = response.getWriter();

        //调用业务层访问数据

        List<Browser> browsers = browserService.findAllBrowsers();

        //创建JSON转换对象

        JSONSerializer serializer = new JSONSerializer();

        serializer.exclude("class");

        String serialize = serializer.serialize(browsers);

        //输出到客户端

        out.print(serialize);
    }
}
