package main.servlet;

import main.service.WareService;
import main.vo.Ware;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/sale")
public class WareServlet {
    //调用业务层

    private final WareService wareService = new WareService();





    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //指定输出到浏览器的类型

        response.setContentType("text/json;charset = utf-8");

        //得到一个打印流进行输出

        PrintWriter out = response.getWriter();

        //得到对象

        List<Ware> wares = wareService.findAllWares();

        //转换json

        String json = wareService.toJson(wares);

        out.print(json);



    }



    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.doPost(request,response);

    }
}
