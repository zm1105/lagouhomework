package onestage.fifthwork.ExamSystemSever;

import onestage.fifthwork.ExamSystemClent.dao.User;
import onestage.fifthwork.ExamSystemClent.dao.UserMessage;

import java.io.IOException;

/**
 * @author : zhoumin
 * @data :  2020/6/9 15:09
 */
public class serverView {
  private serverInitClose sic;
  private serverDao sd;
  private boolean falg = true;

  public serverView(serverInitClose sic, serverDao sd) {
    this.sic = sic;
    this.sd = sd;
  }

  public void serverReceive() throws IOException, ClassNotFoundException {

    while (true) {
      if (falg) {
        UserMessage tum = (UserMessage) sic.getOis().readObject();
        System.out.println("接收的消息是" + tum);
        if (sd.Managercheck(tum.getUser())) {
          tum.setType("success");
          falg =false;
        } else {
          tum.setType("fail");
        }
        sic.getOos().writeObject(tum);
        System.out.println("服务器发送校验成功！！" + tum);
      } else {
        User user = (User) sic.getOis().readObject();
        System.out.println("接收的消息是" + user);
        sd.objectToFile(user);
      }
    }
  }
}