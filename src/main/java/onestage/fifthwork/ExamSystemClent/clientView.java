package onestage.fifthwork.ExamSystemClent;

import onestage.fifthwork.ExamSystemClent.administratorsClient.ExaminationManagement;
import onestage.fifthwork.ExamSystemClent.dao.User;
import onestage.fifthwork.ExamSystemClent.dao.UserMessage;
import onestage.fifthwork.ExamSystemClent.util.clientScanner;

import java.io.IOException;

/**
 * @author : zhoumin
 * @data :  2020/6/9 14:20
 */
public class clientView {

  private clientInitClose cic;
  private boolean falg = true;

  public clientView(clientInitClose cic) {
    this.cic = cic;
  }

  public void clientMainPage() throws IOException, ClassNotFoundException {
    while (falg) {
      System.out.println("  \t\n    在线考试系统");
      System.out.println("-----------------------------");
      System.out.print("【1】 学员系统");
      System.out.println("      【2】 管理员系统");
      System.out.println("【0】 退出系统");
      System.out.println("-------------------");
      System.out.println("请输入需要操作的编号");

      switch (clientScanner.getScanner().nextInt()) {
        case 1:
          System.out.println("正在进入学员系统");
          break;
        case 2:
          clientManagerLogin();
          break;
        case 0:
          System.out.println("退出系统");
          return;
        default:
          System.out.println("输入错误。请重新输入");
      }
    }

    System.out.println("-----------------------------");
    System.out.print("【1】 学员管理");
    System.out.println("【2】 考题管理");
    System.out.println("请输入需要操作的编号");
    int i = clientScanner.getScanner().nextInt();
    while (true) {
      if (i == 1) {
        System.out.println("欢迎进入学员管理模块");
        System.out.print("【1】 增加学员");
        System.out.println("      【2】 删除学员");
        System.out.print("【3】 修改学员");
        System.out.println("      【4】 查找学员");
        System.out.println("请输入需要操作的编号");
        switch (clientScanner.getScanner().nextInt()) {
          case 1:
            ExaminationManagement emm = new ExaminationManagement(cic);
            emm.addStudent();
            break;
          case 2:
            System.out.println("删除成功");
            break;
          case 3:
            System.out.println("修改成功");
            break;
          case 4:
            System.out.println("查询成功");
            break;

        }
      } else if (i == 2) {
        switch (clientScanner.getScanner().nextInt()) {
          case 2:
            System.out.println("欢迎进入学员管理模块");
            System.out.print("【1】 增加考题");
            System.out.println("      【2】 删除考题");
            System.out.print("【3】 修改考题");
            System.out.println("      【4】 查找考题");
            System.out.println("【5】 导入考题");
            break;
          default:
            System.out.println("输入错误。请重新输入");
        }
      } else {
        System.out.println("输入错误");
      }
    }
  }


  /**
   * 客户端管理员登录
   */
  private boolean clientManagerLogin() throws IOException, ClassNotFoundException {
    System.out.println("请输入管理员账号信息");
    String userName = clientScanner.getScanner().next();
    System.out.println("请输入管理员密码");
    String passWord = clientScanner.getScanner().next();
    UserMessage tum = new UserMessage("managerCheck", new User(userName, passWord));
    cic.getOos().writeObject(tum);
    System.out.println("客户端发送信息成功");
    tum = (UserMessage) cic.getOis().readObject();
    if ("success".equals(tum.getType())) {
      System.out.println("登录成功，欢迎使用");
      falg = false;
    } else {
      System.out.println("用户名或密码错误");
    }
    return falg;
  }
}
