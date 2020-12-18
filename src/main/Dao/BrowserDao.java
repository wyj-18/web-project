package main.Dao;

import main.tools.Jdbc;
import main.utils.DataSourceUtils;
import main.vo.Browser;
import org.apache.commons.dbutils.QueryRunner;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BrowserDao {
    private final QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
    private Connection con;
    private PreparedStatement pst;

    public List<Browser> findAllBrowsers(){

        try {
            List<Browser> list = new ArrayList<>();
            Jdbc j = new Jdbc();
            con = j.getConnection();

            list = getAllBrowser();

            return list;


        } catch (SQLException e) {

            e.printStackTrace();

            throw new RuntimeException(e);

        }

    }

    public List<Browser> getAllBrowser() throws SQLException {
        List<Browser> list = new ArrayList<>();
        String sql = "select * from browser";

        pst =  con.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();

        while (rs.next()){
            Browser browser = new Browser();

            browser.setId(rs.getInt(1));
            browser.setName(rs.getString(2));
            browser.setPercent(rs.getDouble(3));

            list.add(browser);
        }

        return list;
    }
}
