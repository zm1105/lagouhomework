package twoatage.secondwork.thirdQuestion.dao;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.testng.annotations.Test;
import twoatage.secondwork.ontQuestion.utils.DruidUtils;
import twoatage.secondwork.thirdQuestion.entity.dept;
import twoatage.secondwork.thirdQuestion.entity.employee;

import java.sql.SQLException;
import java.util.List;

/**
 * @author : zhoumin
 * @data :  2020/7/10 15:07
 * <p>
 * 查询每个员工的 姓名, 薪资 和 所属部门名称
 */
public class deptDao {
  private QueryRunner queryRunner = new QueryRunner(DruidUtils.getDataSource());

  @Test
  public void findAll() throws SQLException {
    String sql = "SELECT * FROM employee";
    List<employee> query = queryRunner.query(sql, new BeanListHandler<employee>(employee.class));
    for (employee employee : query) {
      int did = employee.getDid();
      dept dept = selectDept(did);
      employee.setDept(dept);
      System.out.println(employee);
    }
  }

  public dept selectDept(int did) throws SQLException {
    String sql = "SELECT * FROM dept where id =?";
    dept dept = queryRunner.query(sql, new BeanHandler<dept>(dept.class), did);
    return dept;
  }
}
