package onestage.fifthwork.ExamSystemSever;

import onestage.fifthwork.ExamSystemClent.clientInitClose;
import onestage.fifthwork.ExamSystemClent.dao.User;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author : zhoumin
 * @data :  2020/6/9 16:49
 */
public class serverDao {


  public boolean Managercheck(User user) {
    if ("admin".equals(user.getUserName()) && "123456".equals(user.getPassWord())) {
      return true;
    }
    return false;
  }

  public void objectToFile(User user) throws IOException {
    ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\user.txt"));
    oos.writeObject(user);
    oos.close();
  }
}
