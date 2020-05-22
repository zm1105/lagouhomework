package onestage.thirdwork.questionfive;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zhoumin
 * @data :  2020/5/22 13:06
 */
public class poker {

  private String hs;
  private String dianshu;
  private String[] yss = new String[]{"♦", "♣", "♥", "♠"};
  private String[] numbers = new String[]{"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};


  public List<poker> createPoker() {
    List<poker> list = new ArrayList<>();
    System.out.println("开始创建牌");
    for (int i = 0; i < yss.length; i++) {
      for (int j = 0; j < numbers.length; j++) {
        list.add(new poker(yss[i], numbers[i]));
      }
    }
    System.out.println("---------扑克牌创建成功---------");
    return list;
  }

  public List<poker> washPoke(List<poker> list) {
    System.out.println("--------开始洗牌...-------");
    poker poker = null;
    for (int i = 0; i < list.size(); i++) {
      int randrom = (int) (Math.random() * 52);
      poker = list.get(randrom);
      list.set(randrom, list.get(i));
      list.set(i, poker);
    }
    System.out.println("--------洗牌结束!--------");
    return list;

  }

  public poker() {
  }

  public poker(String hs, String dianshu) {
    this.hs = hs;
    this.dianshu = dianshu;
  }

  public String getHs() {
    return hs;
  }

  public void setHs(String hs) {
    this.hs = hs;
  }

  public String getDianshu() {
    return dianshu;
  }

  public void setDianshu(String dianshu) {
    this.dianshu = dianshu;
  }

  @Override
  public String toString() {
    return getHs() + getDianshu();
  }
}