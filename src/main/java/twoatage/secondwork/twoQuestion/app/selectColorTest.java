package twoatage.secondwork.twoQuestion.app;

import twoatage.secondwork.twoQuestion.dao.phoneDao;

import java.sql.SQLException;

/**
 * @author : zhoumin
 * @data :  2020/7/10 14:43
 */
public class selectColorTest {
  public static void main(String[] args) {
    String color ="白色";
    phoneDao phoneDao = new phoneDao();
    try {
      phoneDao.selevtcolor(color);
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
