package onestage.fifthwork.test;

import onestage.fifthwork.ExamSystemSever.serverDao;
import onestage.fifthwork.ExamSystemSever.serverInitClose;
import onestage.fifthwork.ExamSystemSever.serverView;

import java.io.EOFException;
import java.io.IOException;

/**
 * @author : zhoumin
 * @data :  2020/6/9 11:27
 */
public class ServerTest {
  public static void main(String[] args) {
    serverInitClose sic = null;
    try {
      sic = new serverInitClose();
      sic.severinit();
      serverDao sd = new serverDao();
      serverView sv = new serverView(sic, sd);
      sv.serverReceive();


    } catch (EOFException e) {

    } catch (IOException e) {
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    } finally {
      try {
        sic.severclose();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
