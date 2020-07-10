package twoatage.secondwork.ontQuestion.dao;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import twoatage.secondwork.ontQuestion.utils.DruidUtils;

import java.sql.SQLException;

/**
 * @author : zhoumin
 * @data :  2020/7/9 10:33
 */
public class accountDao {
  /**
   * 实现卡号：1122334455向55443332211转账5000元的操作；
   */
  private QueryRunner queryRunner = new QueryRunner(DruidUtils.getDataSource());

  public Double selectBalance(String card) throws SQLException {
    String sql = "select balance from account where card = ?";
    Double balance = queryRunner.query(sql, new ScalarHandler<>(), card);
    return balance;
  }

  public int transferAccounts(String card, Double amount) throws SQLException {
    String sql = "update account set balance = ? where card =?";
    Object[] parem = {amount, card};
    int update = queryRunner.update(sql, parem);
    return update;
  }

  public int records(String cardid, String tratype, Double tramoney, String tradate) throws SQLException {
    String sql = "insert into transaction values(?,?,?,?,?)";
    Object[] params = {null, cardid, tratype, tramoney, tradate};
    int update = queryRunner.update(sql, params);
    return update;
  }
}
