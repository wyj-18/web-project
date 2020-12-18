package main.service;

import flexjson.JSONSerializer;
import main.Dao.WareDao;
import main.vo.Ware;

import javax.servlet.annotation.WebServlet;
import java.util.List;

@WebServlet("/ware")
public class WareService {
    private final WareDao wareDao = new WareDao();

    /**

     * 查询所有sale,

     * @return

     */

    public List<Ware> findAllWares(){

        return wareDao.findAllWares();



    }

//将数据转换成json对象

    public String toJson(List<Ware>sales){

        //创建JSON转换对象

        JSONSerializer serializer = new JSONSerializer();

        //排除class属性

        serializer.exclude("class");

        return serializer.serialize(sales);



    }
}
