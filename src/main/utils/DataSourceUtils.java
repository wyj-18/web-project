package main.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;

public class DataSourceUtils {
    //创建一个连接池

    private static final ComboPooledDataSource ds = new ComboPooledDataSource();




    public static DataSource getDataSource() {

        return ds;

    }
}
