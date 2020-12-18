package main.service;

import main.Dao.BrowserDao;
import main.vo.Browser;

import java.util.List;

public class BrowserService {
    private final BrowserDao browserDao = new BrowserDao();

    /*

     * 查询所有的浏览器

     *@return

     */

    public List<Browser> findAllBrowsers(){

        return browserDao.findAllBrowsers();

    }

}
