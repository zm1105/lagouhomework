package twoatage.secondwork.thirdQuestion.app;

import twoatage.secondwork.thirdQuestion.dao.employeeDao;

import java.sql.SQLException;

/**
 * @author : zhoumin
 * @data :  2020/7/10 15:04
 */
public class selectemployee {
  //需求1: 查询所有的员工信息 (不包含没有部门的员工)。
  public static void main(String[] args) {
    employeeDao employeeDao = new employeeDao();
    try {
      employeeDao.selectemployee();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
