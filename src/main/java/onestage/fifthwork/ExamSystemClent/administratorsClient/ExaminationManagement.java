package onestage.fifthwork.ExamSystemClent.administratorsClient;

import onestage.fifthwork.ExamSystemClent.clientInitClose;
import onestage.fifthwork.ExamSystemClent.dao.User;
import onestage.fifthwork.ExamSystemClent.util.clientScanner;

import java.io.IOException;

/**
 * @author : zhoumin
 * @data :  2020/6/10 14:43
 */
public class ExaminationManagement {
  private clientInitClose cic;
  public ExaminationManagement(clientInitClose cic) {
    this.cic = cic;
  }
    public void addStudent() throws IOException {
      System.out.println("请输入需要增加的姓名");
      String userName = clientScanner.getScanner().next();
      System.out.println("请输入学生的初始密码");
      String passWord = clientScanner.getScanner().next();
      User user= new User(userName,passWord);
      cic.getOos().writeObject(user);
      System.out.println("客户端学生增加发送信息成功");
  }
}
