package twoatage.secondwork.twoQuestion.app;

import twoatage.secondwork.twoQuestion.dao.phoneDao;

import java.sql.SQLException;

/**
 * @author : zhoumin
 * @data :  2020/7/10 14:37
 */
public class selectPriceTest {
/**需求1:  查询价格高于2000元，生产日期是2019年之前的所有手机*/
  public static void main(String[] args) {
    Object[] paer = {2000, "2019-01-01"};
    phoneDao phoneDao = new phoneDao();
    try {
      phoneDao.selectPrice(paer);
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
