package twoatage.secondwork.thirdQuestion.dao;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import twoatage.secondwork.ontQuestion.utils.DruidUtils;
import twoatage.secondwork.thirdQuestion.entity.employee;

import java.sql.SQLException;
import java.util.List;

/**
 * @author : zhoumin
 * @data :  2020/7/10 14:58
 */
public class employeeDao {

 private QueryRunner queryRunner = new QueryRunner(DruidUtils.getDataSource());



  /** 需求1: 查询所有的员工信息 (不包含没有部门的员工)。*/
  public  void selectemployee() throws SQLException {
    String sql="SELECT * from employee  a where  a.did is not null";
   List<employee> query = queryRunner.query(sql, new BeanListHandler<employee>(employee.class));
   for (employee employee : query) {
     System.out.println(employee);
   }
 }
}
