package main.Dao;

import main.utils.DataSourceUtils;
import main.vo.Ware;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class WareDao {
    //数据源的结果传给QueryRunner

    private final QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());



    public List<Ware> findAllWares() {

        try {

            return runner.query("select * from ware", new BeanListHandler<>(Ware.class));

        } catch (SQLException e) {

            e.printStackTrace();

            throw new RuntimeException(e);

        }

    }
}
