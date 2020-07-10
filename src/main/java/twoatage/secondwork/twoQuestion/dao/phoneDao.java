package twoatage.secondwork.twoQuestion.dao;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import twoatage.secondwork.ontQuestion.utils.DruidUtils;
import twoatage.secondwork.twoQuestion.entity.phone;

import java.sql.SQLException;
import java.util.List;

/**
 * @author : zhoumin
 * @data :  2020/7/10 10:14
 * <p>
 * 需求1:  查询价格高于2000元，生产日期是2019年之前的所有手机
 *
 */
public class phoneDao {
  private QueryRunner queryRunner = new QueryRunner(DruidUtils.getDataSource());


  public void selectPrice(Object[] paer) throws SQLException {
    String sql = "select * from phone a where  a.price > ? and  prodate <?";
    List<phone> query = queryRunner.query(sql, new BeanListHandler<>(phone.class), paer);
    for (phone phone : query) {
      System.out.println(phone);
    }
  }

public  void selevtcolor(String color) throws SQLException {
//    需求2:  查询所有颜色是白色的手机信息
  String sql="select * from phone a where a.color = ?";
  phone query = queryRunner.query(sql, new BeanHandler<phone>(phone.class), color);
  System.out.println(query);
}
}
