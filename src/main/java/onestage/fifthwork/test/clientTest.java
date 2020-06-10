package onestage.fifthwork.test;

import onestage.fifthwork.ExamSystemClent.clientInitClose;
import onestage.fifthwork.ExamSystemClent.clientView;
import onestage.fifthwork.ExamSystemClent.util.clientScanner;

import java.io.IOException;

/**
 * @author : zhoumin
 * @data :  2020/6/9 14:17
 */
public class clientTest {
  public static void main(String[] args) {
    clientInitClose cic = null;
    try {
      cic = new clientInitClose();
      cic.clientInit();
      clientView cv = new clientView(cic);
      try {
        cv.clientMainPage();
      } catch (ClassNotFoundException e) {
        e.printStackTrace();
      }
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        cic.clientClose();
        clientScanner.closeScanner();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
