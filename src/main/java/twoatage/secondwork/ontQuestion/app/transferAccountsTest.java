package twoatage.secondwork.ontQuestion.app;

import twoatage.secondwork.ontQuestion.dao.accountDao;
import twoatage.secondwork.ontQuestion.utils.DateUtils;

import java.sql.SQLException;

/**
 * @author : zhoumin
 * @data :  2020/7/9 11:18
 * 实现卡号：1122334455向55443332211转账5000元的操作
 */
public class transferAccountsTest {
  public static void main(String[] args) {
    accountDao accountDao = new accountDao();
    String tomcard = "1122334455";
    String lucycard = "55443332211";
    Double amount = 5000.0;
    try {
      Double tombalance = accountDao.selectBalance(tomcard);
      Double lucybalance = accountDao.selectBalance(lucycard);
      if (tombalance >= amount) {
        accountDao.transferAccounts(tomcard, (tombalance - amount));
        accountDao.transferAccounts(lucycard, lucybalance + amount);
        accountDao.records(tomcard, "0", amount, DateUtils.getDateFormart());
        accountDao.records(lucycard, "1", amount, DateUtils.getDateFormart());
      } else {
        System.out.println("对不起，余额不足！");
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
