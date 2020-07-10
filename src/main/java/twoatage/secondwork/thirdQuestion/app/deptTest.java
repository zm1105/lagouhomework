package twoatage.secondwork.thirdQuestion.app;

import twoatage.secondwork.thirdQuestion.dao.deptDao;

import java.sql.SQLException;

/**
 * @author : zhoumin
 * @data :  2020/7/10 15:24
 */
public class deptTest {
  public static void main(String[] args) throws SQLException {
    deptDao deptDao = new deptDao();
    deptDao.findAll();
  }
}